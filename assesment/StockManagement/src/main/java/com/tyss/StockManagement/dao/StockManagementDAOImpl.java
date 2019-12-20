package com.tyss.StockManagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.StockManagement.dto.Products;
@Repository
public class StockManagementDAOImpl implements StockManagementDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public boolean addProduct(Products product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
			}catch (Exception e) {
		return false;
		}
	}

	@Override
	public boolean updateProduct(Products product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Products p = manager.find(Products.class, product.getId());
			p.setCategory(product.getCategory());
			p.setName(p.getName());
			p.setPrice(product.getPrice());
			p.setQuantity(product.getQuantity());
			transaction.commit();
			return true;
			}catch (Exception e) {
		return false;
		}
	}

	
	@Override
	public boolean deleteProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Products product = manager.find(Products.class, id);
			manager.remove(product);
			transaction.commit();
			return true;
			}catch (Exception e) {
		return false;
		}
	}
	@Override
	public boolean deleteProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			String jpql = "from Products where name=:name";
			TypedQuery<Products> typedQuery = manager.createQuery(jpql,Products.class);
			typedQuery.setParameter("name", name);
			Products product = typedQuery.getSingleResult();
			manager.remove(product);
			transaction.commit();
			return true;
			}catch (Exception e) {
		return false;
		}
	}

	@Override
	public boolean deleteProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			String jpql = "from Products where category=:category";
			TypedQuery<Products> typedQuery = manager.createQuery(jpql,Products.class);
			typedQuery.setParameter("category", category);
			List<Products> products = typedQuery.getResultList();
			for(Products product : products) {
				manager.remove(product);
			}
			
			transaction.commit();
			return true;
			}catch (Exception e) {
		return false;
		}
	}

	@Override
	public Products getProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Products.class, id);
				}

	@Override
	public Products getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Products where name=:name";
			TypedQuery<Products> typedQuery = manager.createQuery(jpql,Products.class);
			typedQuery.setParameter("name", name);
			Products product = typedQuery.getSingleResult();
			return product;
			}catch (Exception e) {
		return null;
		}
	}

	@Override
	public List<Products> getProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Products where category=:category";
		return null;
	}

	@Override
	public List<Products> getAllProduct() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Products";
		TypedQuery<Products> typedQuery = manager.createQuery(jpql,Products.class);
		return typedQuery.getResultList();
	}


}
