package com.example.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.easynotes.model.ExpenseCategory;

public interface ExpenceCategoryRepository extends JpaRepository<ExpenseCategory, Long> {

}
