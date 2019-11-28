package com.example.easynotes.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;
@Repository
public class ExpenseModel {
	  private int e_id;
	    private String e_amount;
	    private LocalDateTime createDateTime;
		public int getE_id() {
			return e_id;
		}
		public void setE_id(int e_id) {
			this.e_id = e_id;
		}
		public String getE_amount() {
			return e_amount;
		}
		public void setE_amount(String e_amount) {
			this.e_amount = e_amount;
		}
		public LocalDateTime getCreateDateTime() {
			return createDateTime;
		}
		public void setCreateDateTime(LocalDateTime createDateTime) {
			this.createDateTime = createDateTime;
		}
	 

}
