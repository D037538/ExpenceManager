package com.example.easynotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easynotes.model.ExpenseCategory;
import com.example.easynotes.model.Expenses;
import com.example.easynotes.repository.ExpenceCategoryRepository;
import com.example.easynotes.repository.ExpensesRepository;
import com.example.easynotes.service.ExpenseCategoryService;


@RestController
@RequestMapping("/api")
public class ExpenseCategotyController {
	 @Autowired
	 ExpenceCategoryRepository expenceCategoryRepository;
	 
	 @Autowired
	 ExpenseCategoryService expenseCategoryService;
	
	
	/*
	 * @PostMapping("/addCategory") public ExpenseCategory
	 * createExpensesCategories(@RequestBody ExpenseCategory expenseCategory) {
	 * return expenseCategoryService.save(); }
	 */
	
	  @PostMapping("/addCategory")
	  public ExpenseCategory createExpensesCategories(@RequestBody ExpenseCategory expenseCategory) {
	  return expenceCategoryRepository.save(expenseCategory);
	  }
	  
	  @GetMapping("/categories") public List<ExpenseCategory>
	  getAllExpensesCategory() { return expenceCategoryRepository.findAll(); }
	 
}
