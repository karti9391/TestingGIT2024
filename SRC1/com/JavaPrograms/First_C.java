package com.JavaPrograms;

public class First_C {
	  public void myMethod()   
	    {  
	    System.out.println("Method");  
	    }  
	      
	    {  
	    System.out.println(" static Block");  
	    }  
	          
	    public void First_C()  
	    {  
	    System.out.println("Constructor ");  
	    }  
	    static {  
	        System.out.println("constructor block");  
	    }  
	    public static void main(String[] args) {  
	    First_C c = new First_C();  
	    c.First_C();  
	    c.myMethod();  
	  }  
	}   


