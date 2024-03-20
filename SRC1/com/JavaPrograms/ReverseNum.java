package com.JavaPrograms;

public class ReverseNum {
public static void main(String[] args) {
	
	// using ApI
	/*
	 * int num = 266; int rev = 0; while(num!=0) { rev = rev*10+num%10; num =
	 * num/10;
	 * 
	 * } System.out.println("reverse numbers: "+rev);
	*/

	/*
	 * int num = 256; StringBuffer rev; StringBuffer sb = new
	 * StringBuffer(String.valueOf(num)); StringBuffer rev1 = sb.reverse();
	 * 
	 * System.out.println("reverse num: "+rev1);
	 */


int num1 = 3256;
StringBuilder sb1 = new StringBuilder();
sb1.append(num1);
sb1.reverse();




}
}
