package com.ibm.training;

public class User {

	String Account_Id;
	String Account_Name;
	double Account_Balance;
	String pin;
	public String getAccount_Id() {
		return Account_Id;
	}
	public void setAccount_Id(String account_Id) {
		Account_Id = account_Id;
	}
	public String getAccount_Name() {
		return Account_Name;
	}
	public void setAccount_Name(String account_Name) {
		Account_Name = account_Name;
	}
	public double getAccount_Balance() {
		return Account_Balance;
	}
	public void setAccount_Balance(double account_Balance) {
		Account_Balance = account_Balance;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "User [Account_Id=" + Account_Id + ", Account_Name=" + Account_Name + ", Account_Balance="
				+ Account_Balance + ", pin=" + pin + "]";
	}

	

}
