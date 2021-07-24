package com.wendy.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ProductCategory")
public class ProductCategory {
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		@Column(name = "name")
	    private String name;
		
//	    @ManyToMany(mappedBy = "ProductCategory")
//	    private Set<Product> products;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "ProductCategory [id=" + id + ", name=" + name + "]";
		}

//		public Set<Product> getProducts() {
//			return products;
//		}
//
//		public void setProducts(Set<Product> products) {
//			this.products = products;
//		}

	
	
}
