package com.Automation.stmts;

interface SBIBank{
	
	void AccountCreation();
   void PassBook();
	void BankBalance();
    abstract void MinBal();
	void Bankloans();
}

 abstract class ICCBank implements SBIBank{

	@Override
	public void AccountCreation() {
	System.out.println("Account Creation");
	}

	@Override
	public void PassBook() {
    System.out.println("After you creation A/c, you will get a passbook");		
	}

	@Override
	public void BankBalance() {
	System.out.println("Maintain Bank Balance");
	}

	@Override
	public void MinBal() {
    System.out.println("Maintain minimum Bank balance");		
	}

	@Override
	public void Bankloans() {
	System.out.println("We can take a bank loans");
	}
	
	void CarLoans() {
		System.out.println("To get a car loans also");
	}
}
 
 class AxisBank extends ICCBank{
	 void HomeLoans() {
		 System.out.println("to get house loans with low interset");
	 }
	 
static	void PropertyLoans(){
		 System.out.println("to get the property loans with 1% interset");
	 }
	 
 }

public class InterfaceProg {
public static void main(String[] args) {

/*	AxisBank bank = new AxisBank();
	bank.AccountCreation();
	bank.PassBook();
	bank.BankBalance();
	bank.MinBal();
	bank.BankBalance();
	bank.Bankloans();
	bank.CarLoans();
	bank.PropertyLoans();*/
	
	ICCBank bank = new AxisBank();
	bank.AccountCreation();
	bank.PassBook();
	bank.BankBalance();
	bank.MinBal();
	bank.BankBalance();
	bank.Bankloans();
	bank.CarLoans();
	//bank.PropertyLoans();
	
	
	
	
	
	
}
}
