package com.example.restcrud2.admincontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.restcrud2.entities.Admin;
import com.example.restcrud2.services.IAdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminRestController {
    @Autowired
	IAdminService service;
	@PostMapping(value="/add",consumes="application/json",produces="application/json")
	public Admin addEmployee(@RequestBody Admin admin) {
		return service.insertAdmin(admin);
	}
	@GetMapping("/getall")
	public List<Admin> getAll(){
		return service.getAllAdmin();
	}
	@PutMapping("/update")
	public Admin updateUser(@RequestBody Admin admin) {
		return service.updateAdmin(admin);
	}
	@GetMapping("/get/{adminId}")
	public Admin getUserbyId(@PathVariable int adminId) {
		return service.getAdminById(adminId);
	}
	@DeleteMapping("/delete/{adminId}")
	public String deleteUserById(@PathVariable int adminId) {
		service.deleteAdminById(adminId);
		return "record deleted";
	
	}
	@GetMapping("/getadminbyname/{adminName}")
	public Admin getUserByGender(@PathVariable String adminName) {
		return service.getUserByAdminName(adminName);
	}
	@GetMapping("/getAdminsorted/{adminName}")
	public List<Admin> getAdminSorted(@PathVariable String adminName) {
		return service.getAdminSorted(adminName);
	}
	}

