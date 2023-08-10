package com.monkata.loans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monkata.loans.Entity.Loans;
import com.monkata.loans.services.ILoanService;
import com.monkata.loans.services.LoanService;
import com.monkata.loans.services.LoanServiceConfig;

import dto.Config;
import dto.CustomerDto;

@RestController
public class LoansController {
  
	@Autowired
	LoanServiceConfig config;
	
	@Autowired
	ILoanService loanService;

	 @GetMapping(path="properties")
	 public Config getProperties(){
		 Config c = new Config();
		 c.setConfig(config);
		 return c;
	 }
	 
	 @GetMapping(path="getLoanByCustomerId/{id}")
	 public List<Loans> getLoansDetails(@PathVariable  Long id){
		 return loanService.getLoansByCustomerId(id);
	 }
	 
	 @PostMapping(path="")
	 public Loans save(@RequestBody Loans l){
		 return loanService.save(l);
	 }
	 
	 @GetMapping(path="")
	 public List<Loans> getLoans(){
		 return loanService.findAll();
	 }
	

}
