package com.Automation.stmts;

class Superstatic{
	static int var_i=12;
	static int addition(int var_i1) {
		int sum;
		sum= var_i+var_i1;
		return sum;
	}
}
 


 class Superclass_Static  extends Superstatic{
	 public static void main(String[] args) {
		
		 int result =0;
		 result = Superstatic.addition(20);
		 System.out.println("the value of result is: "+result);
	}

}
