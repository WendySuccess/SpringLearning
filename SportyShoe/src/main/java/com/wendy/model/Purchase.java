package com.wendy.model;


import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Purchase")
public class Purchase {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private Date DateIssued;
	
    @ManyToMany
    private Set<Product> products;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateIssued() {
		return DateIssued;
	}
	public void setDateIssued(Date dateIssued) {
		DateIssued = dateIssued;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Purchase [id=" + id + ", DateIssued=" + DateIssued + ", products=" + products + "]";
	}
	

	
	
}
