package com.clasc.clascWebService.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue
	
	private long transaction_id;
	private char watchMovieMode; //M - mobile, T - TV, B - Both 
	private String payment_mode; //CC - Credit Card; DC- Debit Card; PT - PayTm, NB - Netbanking
	private String transaction_status;//S - Successful; U - Unsuccesful 
	private long transaction_amt; 
	private Date transactionDate_time;
	private Date bookingDate_time;
	private Date bookingEndDate_time;
	private long gstAmt;
	private long internetHandlingAmt; 
	private long netSaleAmt;
	
	
	
	public long getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}
	public char getWatchMovieMode() {
		return watchMovieMode;
	}
	public void setWatchMovieMode(char watchMovieMode) {
		this.watchMovieMode = watchMovieMode;
	}
	public String getPayment_mode() {
		return payment_mode;
	}
	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}
	public String getTransaction_status() {
		return transaction_status;
	}
	public void setTransaction_status(String transaction_status) {
		this.transaction_status = transaction_status;
	}
	public long getTransaction_amt() {
		return transaction_amt;
	}
	public void setTransaction_amt(long transaction_amt) {
		this.transaction_amt = transaction_amt;
	}
	public Date getTransactionDate_time() {
		return transactionDate_time;
	}
	public void setTransactionDate_time(Date transactionDate_time) {
		this.transactionDate_time = transactionDate_time;
	}
	public Date getBookingDate_time() {
		return bookingDate_time;
	}
	public void setBookingDate_time(Date bookingDate_time) {
		this.bookingDate_time = bookingDate_time;
	}
	public Date getBookingEndDate_time() {
		return bookingEndDate_time;
	}
	public void setBookingEndDate_time(Date bookingEndDate_time) {
		this.bookingEndDate_time = bookingEndDate_time;
	}
	public long getGstAmt() {
		return gstAmt;
	}
	public void setGstAmt(long gstAmt) {
		this.gstAmt = gstAmt;
	}
	public long getInternetHandlingAmt() {
		return internetHandlingAmt;
	}
	public void setInternetHandlingAmt(long internetHandlingAmt) {
		this.internetHandlingAmt = internetHandlingAmt;
	}
	public long getNetSaleAmt() {
		return netSaleAmt;
	}
	public void setNetSaleAmt(long netSaleAmt) {
		this.netSaleAmt = netSaleAmt;
	} 
	
	
	
	

}
