package org.thangavel;

public class Abstract1 extends Abstract {

	@Override
	public void materials() {
		
		System.out.println("i look very smart");
		System.out.println("its very cool");
		System.out.println("all the best");
		
	}

	@Override
	public void username() {
		
		System.out.println("its me");
		System.out.println("all my control");
		System.out.println("very cool ma of the year");
		
	}
	
	public static void main(String[] args) {
		
		Abstract1 obj = new Abstract1();
		obj.materials();
		obj.username();
		obj.id();
	}
	

}
