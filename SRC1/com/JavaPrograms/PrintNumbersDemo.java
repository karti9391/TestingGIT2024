package com.JavaPrograms;

public class PrintNumbersDemo {
	
	public static void printNumbers(int num) {
		if(num<=20) {
			
			System.out.println(num);
			num++;
			printNumbers(num);
		}
	}
	
	
	
	
	
public static void main(String[] args) {
	printNumbers(0);
	/*
	 * int num=20; for(int i=0;i<=num;i++) {
	 * 
	 * System.out.println(i); }
	 */
}
}
