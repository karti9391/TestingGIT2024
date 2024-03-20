package com.JavaPrograms;

import java.util.Scanner;

public class PalindromeStringDemo {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String str = sc.next();
	
	String org_str = str;
	String rev = " ";
	int len = str.length();
	
	for(int i=len-1;i>=0;i--) {
		rev= rev+str.charAt(i);
	}
	if(org_str.equals(rev)) {
		System.out.println("it is palindrome str");
		
	}
	else System.out.println("it is not palindrome string");
	
	
}
}
