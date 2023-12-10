package com.example.restcrud2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restcrud2.entities.Admin;
import com.example.restcrud2.repository.AdminRepository;

@Service
public class AdminServiceImp implements IAdminService {
    @Autowired
	AdminRepository repo;
	@Override
	public Admin insertAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}

	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}

	@Override
	public Admin getAdminById(int adminId) {
		// TODO Auto-generated method stub
		return repo.findById(adminId).orElse(null);
	}

	@Override
	public void deleteAdminById(int adminId) {
		// TODO Auto-generated method stub
		repo.deleteById(adminId);
		
	}
	@Override
	public Admin getUserByAdminName(String adminName) {
		// TODO Auto-generated method stub
		return repo.findByAdminName(adminName);
	}

	@Override
	public List<Admin> getAdminSorted(String adminName) {
		// TODO Auto-generated method stub
		return repo.getAdminSorted(adminName);
	}
   
	
}
