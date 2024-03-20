package com.Automation.stmts;

import java.util.Comparator;
import java.util.TreeSet;

class customsorting implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		System.out.println("1");
		String str = (String) o1;
		String str1 = (String) o2;
		return str.compareTo(str1);
	}
	
}

public class CustomSortingProg {
	public static void main(String[] args) {
TreeSet set = new TreeSet();
		set.add("java");
		set.add("selenium");
		set.add("hike");
		set.add("salary");
		set.add("test");
		System.out.println(set);
		
		
		
	}

}
