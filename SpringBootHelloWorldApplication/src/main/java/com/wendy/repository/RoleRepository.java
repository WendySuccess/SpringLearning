package com.wendy.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wendy.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}