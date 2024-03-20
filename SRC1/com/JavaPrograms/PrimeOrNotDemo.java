package com.JavaPrograms;

import java.util.Scanner;

public class PrimeOrNotDemo {
public static void main(String[] args) {
	
int num=3;
	int count = 0;
	if(num>1) {
		for(int i=1;i<=num;i++) {
			if(num%i  ==0) 
				count++;
			
			if(count==2) {
				System.out.println("it's a prime");
			}
			
		}
		
	}
	
	else System.out.println("it is not a prime num");
}
}
