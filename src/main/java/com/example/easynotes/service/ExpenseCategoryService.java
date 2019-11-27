package com.example.easynotes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.easynotes.exception.ExpenseCategoryDto;
import com.example.easynotes.model.ExpenseCategory;
import com.example.easynotes.repository.ExpenceCategoryRepository;


@Service
public class ExpenseCategoryService {
	@Autowired
	ExpenceCategoryRepository expenceCategoryRepository;
	
	
	/*
	 * @Autowired ExpenseCategoryDto expenseCategoryDto; public ExpenseCategory
	 * save() {
	 * 
	 * ExpenseCategory ec =new ExpenseCategory();
	 * ec.setEc_id(expenseCategoryDto.getEc_id());
	 * ec.setEc_name(expenseCategoryDto.getEc_name());
	 * expenceCategoryRepository.save(ec); return ec;
	 * 
	 * }
	 */
}
