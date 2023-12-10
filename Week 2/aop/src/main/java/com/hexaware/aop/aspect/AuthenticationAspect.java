package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

	
	@Pointcut("execution(* com.hexaware.aop.service.BankService.login())")
	public void authentication() { 
		
		
	}

	@Pointcut("execution(* com.hexaware.aop.service.BankService.*())")
	public void authorization() {  

		
		
	}
	
	
	@Before("authentication() ||  authorization()")
	public void   authenticationAuthorization() { 
		
		System.out.println("User Login verified with authentication and authorization");
		
	}
	
	
	
	
	
	

}
