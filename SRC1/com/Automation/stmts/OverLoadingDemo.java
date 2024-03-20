package com.Automation.stmts;

public class OverLoadingDemo {
	
	public int test(int a, int b) {
		int result = a+b;
		System.out.println("int int result: "+result);
		return result;
	}
	
	public float test(float a, float b) {
		float result = a+b;
		System.out.println("float float result: "+result);
		return result;
		
	}
	
	public double test(double a, double b) {
		double result = a+b;
		System.out.println("double double result: "+result);
		return result;
		
	}
	
	
	
public static void main(String[] args) {
	
	OverLoadingDemo demo = new OverLoadingDemo();
	demo.test(25, 32);
	demo.test(2.3, 31.5);
	demo.test(36523.233, 6546.234);
	//demo.test('k', 'k');
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
