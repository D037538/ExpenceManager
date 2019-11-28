package com.example.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easynotes.model.ExpenseCategory;

@Repository
public interface ExpenceCategoryRepository extends JpaRepository<ExpenseCategory, Long> {

}
