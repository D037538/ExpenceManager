package com.example.easynotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easynotes.model.Expenses;
import com.example.easynotes.repository.ExpensesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
@RequestMapping("/api")
public class NoteController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
  @Autowired
     ExpensesRepository expensesRepository;
	
     @GetMapping("/expenses")
     public List<Expenses> getAllExpenses() {
         logger.debug("Debug message");
         logger.info("Info message");
         logger.warn("Warn message");
         logger.error("Error message");
         return expensesRepository.findAll();
     }
     
    
    @PostMapping("/addExpenses")
    public Expenses createExpenses(@RequestBody Expenses expenses) {
    	//Expenses e = new Expenses();
    	//e.setElectricity(expenses.getElectricity());
    	
    	//System.out.println("electricity:"+expenses.getFood());
		/*
		 * expenses.setElectricity(100); expenses.setFood(100);
		 * expenses.setGrocery(100); expenses.setInternet(100); expenses.setPhone(9874);
		 */
        return expensesRepository.save(expenses);
    }

}
