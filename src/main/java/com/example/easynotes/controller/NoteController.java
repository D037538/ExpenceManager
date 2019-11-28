package com.example.easynotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easynotes.model.ExpenseModel;
import com.example.easynotes.model.Expenses;
import com.example.easynotes.repository.ExpensesRepository;
import com.example.easynotes.service.ExpenseService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
@RequestMapping("/api")
public class NoteController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
  @Autowired
  ExpenseService expenseService;
  @Autowired
  ExpenseModel expenseModel;
	
	  @GetMapping("/expenses") public List<Expenses> getAllExpenses() {
	  logger.debug("Debug message"); logger.info("Info message");
	  logger.warn("Warn message"); logger.error("Error message"); return
			  expenseService.getAllExpenses(); 
	  }
	  
    
    @PostMapping("/addExpenses")
    public Expenses createExpenses(@RequestBody ExpenseModel expenseModel) {
    	System.out.println("expense controller:"+expenseModel.getE_amount());
		return expenseService.save(expenseModel);
    }

}
