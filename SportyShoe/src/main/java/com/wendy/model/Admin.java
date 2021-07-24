package com.wendy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tutorials")
public class Admin {
	@Id
    @Column(name = "idAdmin")
	private String idAdmin;
	@Column(name = "password")
	private String password;
}
