package com.Automation.stmts;

public class PojoTest {
	
	private int  id ;
	private int sal ;
	
	public void setId(int id) {
		this.id = id;
		System.out.println("id : "+id);
	}
	public void setSal(int sal) {
		this.sal = sal;
		System.out.println("salary: "+sal);
	}
	
	public int getId() {
		System.out.println();
		return id;
	}
	
	public int getSal() {
		System.out.println();
		return sal;
	}
	
	
public static void main(String[] args) {
	PojoTest test = new PojoTest();
	test.setId(2545);
	test.setSal(500000);
	int id=test.getId();
	System.out.println(id);
	 int sal=test.getSal();
	 System.out.println(sal);
}
}
