package com.hexaware.aop.service;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
public class BankService {
	
	
	
		public void login() {
			
			
			System.out.println("User Login success..");
			
		}
	
		
		public  void fundTransfer() {
			
			
			System.out.println("Fund Transfer successfully..");
			
			
		}
		
		public void withdraw() {
			
		
			
			System.out.println("Amount Withdraw successfully..");
			
		}
		
		public void deposit() {
	
			
			System.out.println("Amount Deposited successfully..");
			
		}
		
		public double  getBalance(int acno) {
			
				if(acno > 0) {
					
					return 99000;
				}
				else {
					
					throw new NullPointerException();
				}
			
		}
		
	
	

}
