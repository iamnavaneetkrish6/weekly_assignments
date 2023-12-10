package com.example.restcrud.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.restcrud.test.entity.LoanType;

@Repository
public interface LoanTypeRepository extends JpaRepository<LoanType, Integer> {

	public LoanType findByloanTypeName(String loanTypeName);
	
	public List<LoanType> findByloanInterestrateLessThan(int loanInterest);
	
	@Query("select l from LoanType l where l.loanTermInYear < ?1 order by l.loanInterestrate")
	public List<LoanType> getByInterestRateSorted(int loanTermInYear);
	
	
	
	
}
/*
public Employee   findByEname(String ename); // select * from Employee_Details where ename =?;

public Employee  findBySalary(double salary);



public List<Employee> findBySalaryGreaterThan(double salary);


public List<Employee> findBySalaryLessThan(double salary);

@Query("Select e from Employee e where e.salary> ?1 order by e.ename")
public List<Employee> getEmployeeSorted(double salary);*/