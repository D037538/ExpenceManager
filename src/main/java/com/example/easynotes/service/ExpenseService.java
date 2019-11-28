package com.example.easynotes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.easynotes.model.ExpenseCategory;
import com.example.easynotes.model.ExpenseModel;
import com.example.easynotes.model.Expenses;
import com.example.easynotes.repository.ExpensesRepository;

@Service
public class ExpenseService {
	  @Autowired
	  ExpensesRepository expensesRepository;
		
	  @Autowired 
	  ExpenseModel expenseModel;
	
	  public Expenses save(ExpenseModel expenseModel) {
		  Expenses e =new Expenses();
		  System.out.println("in service"+expenseModel.getE_amount());
		  e.setE_id(expenseModel.getE_id());
		  e.setE_amount(expenseModel.getE_amount());
		  e.setCreateDateTime(expenseModel.getCreateDateTime());
		  expensesRepository.save(e);
		  return e;
		 }
		 
	  public List<Expenses> getAllExpenses() {
			return expensesRepository.findAll();
		}

}
