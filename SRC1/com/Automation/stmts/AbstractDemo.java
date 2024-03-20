package com.Automation.stmts;


abstract class Demo{
	 static int num = 10;
static 	String result1= "job";
	
static	void addition() {
		String result;
		result = num+result1;
		System.out.println("result of: "+result);
	}
}
class Demo1 extends Demo{
	
}


public class AbstractDemo {
public static void main(String[] args) {
 Demo.addition();
}
}
