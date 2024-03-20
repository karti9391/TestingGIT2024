package com.JavaPrograms;

public class MainClass {

	double overloaded(double d) {
		return d*=d;
		
	}
	int overloaded(int i) {
		System.out.println(i);
		return i ;
	}
	int overloaded(float f) {
		return overloaded(f*=f);
	}
	public static void main(String[] args) {
		
		MainClass main = new MainClass();
		System.out.println(main.overloaded(1));
	}
}
