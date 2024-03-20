package com.Automation.stmts;



class Demo11{

	int salary;
	String tester;
	void Hello() {
		System.out.println(salary+" "+tester);
	}

	public void Hello1() {
		System.out.println("Hello");
		
	}
}


public class ConstructThisSuperProg extends Demo11{

	int salary;
	String tester;
	
	public ConstructThisSuperProg(int salary,String tester) {
		
		this.salary = salary;
		this.tester= tester;
		
		super.Hello1();
		this.Hello();
		
		
	}
	
	public ConstructThisSuperProg() {
		System.out.println("Default constructor");
	}
	
	public ConstructThisSuperProg(int a) {
		System.out.println("int constructor");
	}
	
	public static void main(String[] args) {
		
		ConstructThisSuperProg prog = new ConstructThisSuperProg(150000, "Automation");
	    prog.Hello();
		
		ConstructThisSuperProg prog1 = new ConstructThisSuperProg(5000);
	   //  ConstructThisSuperProg prog3 = new ConstructThisSuperProg();
			
		
		
		
		
		
	}
	
}
