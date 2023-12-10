package com.example.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springsecurity.entity.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
   public UserEntity findByUserName(String userName);
}
