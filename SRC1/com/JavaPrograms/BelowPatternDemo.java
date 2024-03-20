package com.JavaPrograms;

import java.util.Scanner;

public class BelowPatternDemo {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	int row = 1;
	
		for(int i=num;i>=1;i--) {
			for(int j=1;j>=2*i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=row;j++) {
				System.out.print(j+" ");
			}
			for(int j=row-1;j>=1;j--) {
				System.out.print(j+"  ");
			}
			System.out.println();
			row++;
		}
	
	
	
	
	
	
}
}
