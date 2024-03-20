package com.JavaPrograms;

public class CountDigitsDemo {
public static void main(String[] args) {
	int num = 215164454;
	int count = 0;
	while(num>0) {
		num = num/10;
		count++;
		
	}
	System.out.println(" "+count);
}
}
