package com.Automation.stmts;

abstract class Abstractone{
	 
	void study() {
		System.out.println("Study");
	}
	abstract void job();
	abstract void salary();
}
abstract class Abstracttwo extends Abstractone{

	//@Override
	void job() {
		System.out.println("Job is Mandatory now a days");
		
	}

	//@Override
	void salary() {
		System.out.println("Salary is give to the value of the person");
		
	}
	
	void Marriage() {
		System.out.println("Marriage the secondary part of our life");
	}
	
}

class Abstract3 extends Abstractone{

	@Override
	void job() {
		System.out.println("job take the respec");
	}

	@Override
	void salary() {
		System.out.println("salary is to solve the problems");
	}
	
	void kids() {
		System.out.println("Kids will come to our life after marriage");
	}
	
}
public class AbstractProg {
public static void main(String[] args) {

	Abstract3 demo = new Abstract3();
	demo.study();
	demo.job();
	demo.salary();
	
	
}
}
