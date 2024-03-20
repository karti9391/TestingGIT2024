package com.Automation.stmts;

class Bank{
	public void login() {
	System.out.println("login to the Bank");
	}
	public void AccountCreation() {
    System.out.println("Acc creation");
	}
	public void Details() {
	System.out.println("Fill the Details");
	}
	public void MinBal() {
		System.out.println("Maintain MinBalanc");
	}
	public void logout() {
		System.out.println("logout to the Bank");
	}
}

class Atm  extends Bank{
	public void CreateAtmPin() {
		System.out.println("ATM pin creation");
	}
	
	public void CheckBal() {
		System.out.println("Checking Bal from Saving or current");
	}
	public void WithDrawBal() {
		System.out.println("With draw Bal from Saving / current");

	}
}

class Loan extends Atm{
	public void HomeLoans() {
		System.out.println("Home loans");
	}
	public void CarLoans() {
        System.out.println("Cars Loans");
	}
	public void GoldLoans() {
		System.out.println("Gold Loans");
	}
	
}

public class InheritanceDemo {
public static void main(String[] args) {
	/*
	 * Bank bank = new Bank(); bank.login(); bank.AccountCreation(); bank.Details();
	 * bank.MinBal(); bank.logout();
	 */
	
	Atm atm = new Atm();
	atm.login();
	atm.AccountCreation();
	atm.Details();
	atm.MinBal();
	atm.CreateAtmPin();
	atm.CheckBal();
	atm.WithDrawBal();
	atm.logout();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
