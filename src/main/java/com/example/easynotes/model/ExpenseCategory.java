package com.example.easynotes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.tomcat.jni.Address;

@Entity
@Table(name = "expensescategory")
public class ExpenseCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ec_id;
    private String ec_name;
    @OneToOne
    @JoinColumn(name="e_id")
    private Expenses expenses;

	public int getEc_id() {
		return ec_id;
	}
	public void setEc_id(int ec_id) {
		this.ec_id = ec_id;
	}
	public String getEc_name() {
		return ec_name;
	}
	public void setEc_name(String ec_name) {
		this.ec_name = ec_name;
	}
}
