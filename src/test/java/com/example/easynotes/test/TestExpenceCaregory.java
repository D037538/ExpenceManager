package com.example.easynotes.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.easynotes.controller.TestCase;
import com.example.easynotes.model.ExpenseCategory;
import com.example.easynotes.repository.ExpenceCategoryRepository;

public class TestExpenceCaregory {

	TestCase t=new TestCase();
	ExpenseCategory e=new ExpenseCategory();
	@Test
	public void testAddExpenseCAtegory() {
		//int a=expenseCategory.setEc_id(100);
		assertEquals(10, t.add(5, 5));
		//fail("Not yet implemented");
	}
     
}
