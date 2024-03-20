package com.JavaPrograms;

public class FibonacciSeries {
public static void main(String[] args) {
	
 int num=10;
 int t1=0, t2=1;
 for(int i=0;i<=num;i++) {
	 System.out.println(t1+" ");
	 int sum=t1+t2;
	 t2=sum;
	 t1=t2;
	 }
}
}
