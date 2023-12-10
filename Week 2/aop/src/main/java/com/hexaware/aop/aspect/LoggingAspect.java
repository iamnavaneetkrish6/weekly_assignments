package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class LoggingAspect { 
	  
	
		@Before("execution(*  com.hexaware.aop.service.BankService.login())") 
		public void beforeLog() {  
			
			System.out.println("Before Bank Service happen  logs created ");
			
		}
		
		@After("execution(*  com.hexaware.aop.service.BankService.withdraw())")
		public void afterLog() { 
			
			System.out.println("after Bank Service happen  logs created ");
			
		}
		
		
		
		@Pointcut("execution(* com.hexaware.aop.service.BankService.getBalance(..))")
		public void  afterReturningPointCut() {
			
			
		}
		
		
		@AfterReturning(pointcut = "afterReturningPointCut()" , returning ="balance")
		public void afterReturningBalance(double balance) {
			
			
			System.out.println("logger after  only returing balance for  "+ balance);
			
			
		}
		
		@AfterThrowing(pointcut = "afterReturningPointCut()" , throwing = "e")
		public void afterThrowingExp(Exception e) {
			
			
			
			System.out.println("logger after throwing exp " );
			
			
			
		}
		
		
		
		
		

}
