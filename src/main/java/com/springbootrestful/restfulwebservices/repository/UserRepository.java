package com.springbootrestful.restfulwebservices.repository;

import com.springbootrestful.restfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {       //JpaRepository<User, Long> -  type of JPA Entity & type of primary key






}


