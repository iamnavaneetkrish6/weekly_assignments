package com.hexaware.mappingspractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.mappingspractice.entites.User;


public interface UserRepository extends JpaRepository<User,Integer>{

}
