package com.Automation.stmts;

public class SwitchDemo {

	public static void main(String[] args) {
		String browser = "chrome";
		switch (browser) {
		case "chrome":
			System.out.println("Chrome browser");
			
		case "ie":
			System.out.println("Internet Explorer");
			
		case "safari":
			System.out.println("safari browser");
			
		default:
			System.out.println("Default stmt");
			
		}
	}

}
