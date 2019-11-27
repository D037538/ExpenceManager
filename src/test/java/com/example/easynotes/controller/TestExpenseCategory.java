package com.example.easynotes.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.easynotes.model.ExpenseCategory;
@ExtendWith(SpringExtension.class)
@SpringBootTest

class TestExpenseCategory {

	@Test
	void testSaveCategory() {
		ExpenseCategory expenseCategory = new ExpenseCategory();
		expenseCategory.setEc_name("foode");
			}

}
