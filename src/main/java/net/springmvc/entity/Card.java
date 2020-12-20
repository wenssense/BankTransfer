package net.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstname;

	@Column(name = "last_name")
	private String lastname;

	@Column(name = "city")
	private String city;

	@Column(name = "mobile_no")
	private String mobile;

	@Column(name = "employment_type")
	private String empType;

	@Column(name = "employer_name")
	private String empName;

	@Column(name = "monthly_income")
	private String monthIncome;

	@Column(name = "expiry_date")
	private String expDate;

	@Column(name = "cvv")
	private String cvv;

	@Column(name = "card_number")
	private String cardNo;
	

	@Column(name = "card_type")
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getMonthIncome() {
		return monthIncome;
	}

	public void setMonthIncome(String monthIncome) {
		this.monthIncome = monthIncome;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", firstname=" + firstname + ", type=" + type + ", lastname=" + lastname + ", city="
				+ city + ", mobile=" + mobile + ", empType=" + empType + ", empName=" + empName + ", monthIncome="
				+ monthIncome + ", expDate=" + expDate + ", cvv=" + cvv + ", cardNo=" + cardNo + "]";
	}

}
