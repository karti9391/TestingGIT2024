package com.JavaPrograms;

import java.util.Scanner;

public class ArthematicDemo {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	int sum=0;
	/*
	 * for(int i=1,a=1;i<=num;i++,a++) { sum = sum+a; }
	 */
	
	for(int i=1,a=9;i<=num;i++,a+=4) {
		
		sum = sum+a;
	}
	
	System.out.print(sum);
	
	
	
	
}
}
