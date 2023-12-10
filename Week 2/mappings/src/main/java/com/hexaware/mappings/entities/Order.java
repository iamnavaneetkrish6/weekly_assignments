package com.hexaware.mappings.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Order_Master")
public class Order {

	
	@Id
	private int orderId;
	
	@Temporal(TemporalType.DATE)
	private  Date  purchaseDate;
	
	@ManyToMany(cascade = CascadeType.ALL)
	
	@JoinTable(name="products_orders", joinColumns = {@JoinColumn(name="order_id")} , inverseJoinColumns = {@JoinColumn(name="product_id")})
	private  Set<Product>  products = new HashSet<Product>();


	public int getOrderId() {
		return orderId;
	}


	public Date getPurchaseDate() {
		return purchaseDate;
	}


	public Set<Product> getProducts() {
		return products;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}


	public void setProducts(Set<Product> products) {
		this.products = products;
	}	
	
	
	public void addProduct(Product product) {
		
			
			Set<Product> set =	getProducts();
			
					set.add(product);
		
	}
	
	
}
