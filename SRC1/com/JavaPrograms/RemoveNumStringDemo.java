package com.JavaPrograms;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class RemoveNumStringDemo {
public static void main(String[] args) {
	
	String str = "jav683as55elenium";
	char[] ch = str.toCharArray();
	List<WebElement> list = new ArrayList();
	for(Character c:ch) {
		if(!Character.isDigit(c)) {
			//list.add(c);
		}
	}
	System.out.println(list);
}
}
