package com.tyss.StockManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.StockManagement.dao.StockManagementDAO;
import com.tyss.StockManagement.dto.Products;
import com.tyss.StockManagement.dto.ResponseBean;
import com.tyss.StockManagement.service.StockService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StockManagementController {
	
	@Autowired
	private StockService service;
//	private StockManagementDAO dao;

	@PostMapping(path = "/addproduct", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBean addProduct(@RequestBody Products bean) {

		
	
		ResponseBean response = new ResponseBean();
		if (service.addProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("sucess");
			response.setDesc("Data added to the database");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDesc(" failed to add data to the database");
		}

		return response;
	}
	
	@GetMapping(path = "/getallproducts", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBean getAsset() {

		ResponseBean response1 = new ResponseBean();
		List<Products> bean = service.getAllProduct();
		if (bean != null) {
			response1.setStatusCode(201);
			response1.setMessage("Success");
			response1.setDesc("Data found in the database");
			response1.setAssets(bean);
			

		} else {
			response1.setStatusCode(401);
			response1.setMessage("Failure");
			response1.setDesc("Unable to find data in the database");
		}
		return response1;
	}

}
