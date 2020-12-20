package net.springmvc.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Recharge 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rechid;
	private long mobile;
	private int amount;
	
	@CreationTimestamp
	private Date transactionDate;
	
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public int getRechid() {
		return rechid;
	}
	public void setRechid(int rechid) {
		this.rechid = rechid;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
