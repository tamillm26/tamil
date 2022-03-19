package org.thangavel;

public class Methodoverloading {
	
	public void username(String a,String b,String c) {

		System.out.println(a+"//"+b+"//"+c);
		
	}

	private void username(int a,int b,int c) {

		System.out.println(a+"."+b+"."+c);
	}
	
	private void username(int b,char a,float c) {

		System.out.println(a+">"+b+">"+c);
	}
	
	public static void main(String[] args) {
		
		Methodoverloading obj = new Methodoverloading();
		obj.username("yes", "i am", "tamil");
		obj.username(22, 12, 23);
		obj.username(1900, 'T', 2.10F);
	}
}
