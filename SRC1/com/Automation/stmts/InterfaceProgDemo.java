package com.Automation.stmts;



interface Jobs{
	String name = "now a days job is more important";
	void Education();
	void SSC();
	void Inter();
	void Emcet();
	abstract void Btech();
	abstract void Mtech();
}

class Youth implements Jobs{

	@Override
	public void Education() {
		System.out.println("Education is change  your life style");
		
	}

	@Override
	public void SSC() {
		System.out.println("SSC is the End of the childhood");
		
	}

	@Override
	public void Inter() {
		System.out.println("Inter is the Teenage stage");
		
	}

	@Override
	public void Emcet() {
		System.out.println("Emcet is the decide the your talent");
		
	}

	@Override
	public void Btech() {
		System.out.println("to get the knowledge in one technology");
		
	}

	@Override
	public void Mtech() {
		System.out.println("Mtech is giving the master of knowledge in technology");
	}
	
}


class Marriage extends Youth{
	void marriage() {
		System.out.println("Marriage is change your life into to take the family responsibilities");
	}
}


public class InterfaceProgDemo {
public static void main(String[] args) {
	
	Youth youth = new Youth();
	youth.Btech();
	youth.Mtech();
	youth.SSC();
	youth.Inter();
	youth.Education();
	youth.Emcet();
	System.out.println(" name : "+youth.name);
	
	
	
	
	
	
	
	
}
}
