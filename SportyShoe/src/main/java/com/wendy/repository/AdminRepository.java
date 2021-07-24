package com.wendy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wendy.model.Admin;

public interface AdminRepository extends JpaRepository<Admin,Long>{

}
