package com.JavaPrograms;

import java.util.Scanner;

public class PosNegDemo {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	double num = sc.nextDouble();
	
	if(num>0.0) System.out.println("It is a positive  num");
	else
	if(num<0.0) System.out.println("it is a negative num");
}
}
