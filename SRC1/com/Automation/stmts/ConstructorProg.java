package com.Automation.stmts;

public class ConstructorProg {
	 int num1=25;
	int num2=25;
	
	public ConstructorProg(int num1,int num2) {
		this.num1= num1;
		this.num2= num2;
	}
	
	public void sum() {
		System.out.println(num1+"---"+num2);
	}
	
public static void main(String[] args) {
	
	ConstructorProg demo = new ConstructorProg(10,20);
	
	demo.sum();
	
}
}
