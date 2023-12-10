package com.example.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springsecurity.entity.UserEntity;
import com.example.springsecurity.repository.UserRepository;
@Service
public class MyUserDetailService implements UserDetailsService{
    @Autowired
	UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserEntity user=repo.findByUserName(username);
	      
 
    if(user==null) {
    	throw new UsernameNotFoundException(username);
    }
    return new UserPrincipal(user);
}
}
