package com.monkata.loans.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.monkata.loans.Entity.Loans;


public interface LoanRepository extends CrudRepository<Loans, Long>  {
	
	List<Loans> findByCustomerId(Long customerId);

}
