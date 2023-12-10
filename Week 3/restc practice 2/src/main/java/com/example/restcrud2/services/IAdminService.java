package com.example.restcrud2.services;

import java.util.List;

import com.example.restcrud2.entities.Admin;

public interface IAdminService {
     public Admin insertAdmin(Admin user);
     public List<Admin> getAllAdmin();
     public Admin updateAdmin(Admin user);
     public Admin getAdminById(int userId);
     public void deleteAdminById(int userId);
     public Admin getUserByAdminName(String adminName);
     public List<Admin> getAdminSorted(String adminName);
}
