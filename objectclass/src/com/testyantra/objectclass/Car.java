package com.testyantra.objectclass;

public class Car {

	
	
	int cost;
	String brand;
	String color;
	public Car(int cost, String brand, String color) {
		super();
		this.cost = cost;
		this.brand = brand;
		this.color = color;
	}
	
	
	
	
	@Override
	public int hashCode() {
	
		return cost;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (cost != other.cost)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Car [cost=" + cost + ", brand=" + brand + ", color=" + color + "]";
	}
	
	
	
	
}
