package com.JavaPrograms;

public class SplitCharDemo {
public static void main(String[] args) {
	
	String str = "karthik";
	String[] str1 = str.split(" ");
	char[] ch = str.toCharArray();
	for(char c1:ch) {
		System.out.println(c1);
	}
}
}
