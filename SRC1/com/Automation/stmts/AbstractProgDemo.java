package com.Automation.stmts;


abstract class Abstract{
	void FlipKart() {
	System.out.println("In this flipkart to get anything.");	
	}
	abstract void Amazon();
	void Meesho( ) {
		System.out.println("This is having local E-commerce website");
	}
	
}

class Demo2 extends Abstract{
	void Swiggy() {
		System.out.println("To get food fast and tasty");
	}

	@Override
	void Amazon() {
		System.out.println("Global E-commerce appln");
		
	}
	
}







public class AbstractProgDemo {
public static void main(String[] args) {
	
	Demo2 demo = new Demo2();
	demo.FlipKart();
	demo.Amazon();
	demo.Meesho();
}
}
