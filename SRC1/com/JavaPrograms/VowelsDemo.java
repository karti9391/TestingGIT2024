package com.JavaPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class VowelsDemo {
public static void main(String[] args) {
	//ChromeDriver driver = new ChromeDriver();
	
	System.out.println(StringContainsVowels("javaselenium"));
}
public static boolean StringContainsVowels(String input) {
	return input.toLowerCase().matches(".*[aeiou]*.");
}
}
