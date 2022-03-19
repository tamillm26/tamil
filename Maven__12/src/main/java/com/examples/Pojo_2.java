package com.examples;

public class Pojo_2 {
	
	public static void main(String[] args) {
		
		Pojo_1 a = new Pojo_1();
		
		int a2 = a.getA();
		System.out.println("value of a is:"+a2);
		a.setA(50);
		int a3 = a.getA();
		System.out.println("update value of a is:"+a3);
		
		int b = a.getB();
		System.out.println("value of b is:");
		a.setB(40);
		int b2 = a.getB();
		System.out.println("update value of b is:"+b2);
		
	}

}
