package com.JavaPrograms;

import java.util.Scanner;

public class AmstrongNumDemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	int temp = 0;
	int rem = 0;
	int sum = 0;
	temp = num;
	while(num!=0) {
		rem = num%10;
		num = num/10;
		sum = sum+(rem*rem*rem);
		
	}
	if(temp == sum) {
		System.out.println("it is a Amstrong number");
	}
	else System.out.println("it is not a Amstrong number");

	System.out.println("it is a amstrong num \\ it is not a amstrong number");
	
	
}
}
