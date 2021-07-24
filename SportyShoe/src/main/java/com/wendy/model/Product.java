package com.wendy.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Productname;

    private Float price;

    @ManyToMany
    private Set<ProductCategory> ProductCategory;
   

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductname() {
		return Productname;
	}

	public void setProductname(String productname) {
		Productname = productname;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Set<ProductCategory> getProductCategory() {
		return ProductCategory;
	}

	public void setProductCategory(Set<ProductCategory> productCategory) {
		ProductCategory = productCategory;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", Productname=" + Productname + ", price=" + price + ", ProductCategory="
				+ ProductCategory + "]";
	}

	
	

}
