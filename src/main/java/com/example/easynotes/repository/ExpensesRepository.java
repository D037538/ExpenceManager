package com.example.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easynotes.model.Expenses;

@Repository
public interface ExpensesRepository extends JpaRepository<Expenses, Long> {

}
