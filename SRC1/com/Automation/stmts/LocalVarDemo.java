package com.Automation.stmts;

public class LocalVarDemo {
	
	
	int id = 25;
	 static int num = 356;
	public void hello() {
	 final int id=2564;
		
		int result = num+this.id;
	 System.out.println(result);	
	}
	
	public void hardwork() {
		int result =id+num;
		System.out.println(result);
	}
	
	
	
public static void main(String[] args) {
	LocalVarDemo demo = new LocalVarDemo();
	demo.hello();
	demo.hardwork();
	
	
}
}
