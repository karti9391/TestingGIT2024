package com.Automation.stmts;

abstract class Vehicles{
	private static   void bikes () {
		 System.out.println("Super bikes");
	 }
	private final void cars() {
		 System.out.println("Super cars");
	 }
}
class Vehicles1 extends Vehicles{
  static  void bikes() {
       System.out.println("super bikes are expensive");
	}
	 void cars() {
		System.out.println("super cars are expensive");
	}
}
public class OverridingDemo {
public static void main(String[] args) {
	
	Vehicles1 veh = new Vehicles1();
	veh.bikes();
	veh.cars();
	veh.bikes();
}
}
