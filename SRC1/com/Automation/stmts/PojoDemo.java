package com.Automation.stmts;

public class PojoDemo {
 private int PractHrs ;
	private String job ;
	
   public int getPractHrs() {
	   System.out.println("practHrs: "+PractHrs);
	   return PractHrs;
   }
	public String getjob() {
		System.out.println("job: "+job);
		return job;
	}
	
	
public static void main(String[] args) {
	PojoDemo demo = new PojoDemo();
	int practhrs=demo.getPractHrs();
	System.out.println(practhrs);
	String job=demo.getjob();
	System.out.println(job);
}
}
