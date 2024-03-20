package com.Automation.stmts;

class EncapsulationProg{
	
	public int  PractHrs = 9;
	public String result = "job";
	
	public void Testing() {
		
		System.out.println(PractHrs+"..........."+result);
	}
	
	
	
}

public class EncapsulationDemo {
public static void main(String[] args) {
	
	EncapsulationProg prog = new EncapsulationProg();
	
	
	
	
	
	
	prog.Testing();
}
}
