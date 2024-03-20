package com.Automation.stmts;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProg {
public static void main(String[] args) {
	
	ArrayList list = new ArrayList<>();
	list.add(12);
	list.add("java");
	list.add(210);
	list.add("selenium");
	list.add(321);
	list.add("job");
	list.add(null);
	list.lastIndexOf(list);
	list.remove(0);
	System.out.println(list);
	
	ArrayList list1 = new ArrayList<>();
	list1.addAll(list);
	list1.add("test");

	System.out.println(list1);


}
}
