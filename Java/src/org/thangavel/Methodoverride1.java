package org.thangavel;

public class Methodoverride1 extends Methodoverride {
	
	@Override
	public void frnd() {
		
		super.frnd();
		
		System.out.print(" Is a Best Frnd of");
	}

	@Override
	public void unexpectedperson() {

		super.unexpectedperson();
		
		System.out.println("kaali maadu is a unexpected person of Ash.");
	}
	
	public static void main(String[] args) {
		
		Methodoverride1 obj = new Methodoverride1();
		
		obj.frnd();
		obj.unexpectedperson();
		
	}
}
