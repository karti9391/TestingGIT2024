package com.Automation.stmts;

import java.util.LinkedList;

public class LinkedListProg {
public static void main(String[] args) {
	
	LinkedList list = new LinkedList<>();
	
	list.add(12);
	list.add("java");
	list.add(210);
	list.add("selenium");
	list.add(321);
	list.add("job");
	list.add(null);
	
	list.removeFirst();
	list.removeLast();
	
	
	System.out.println(list);
	
	
	
}
}
