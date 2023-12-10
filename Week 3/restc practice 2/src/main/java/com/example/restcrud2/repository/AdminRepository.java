package com.example.restcrud2.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.restcrud2.entities.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
      public Admin findByAdminName(String adminName);
      @Query("select a from Admin a where a.adminName = ?1")   
      public List<Admin> getAdminSorted(String adminName);
}
