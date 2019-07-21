package org.tcs.test;

public class Exception {
	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4/0);
		}
		catch(Arithmetic Exception e) {
			System.out.println("Don't divide by Zero");
		}
		finally {
			System.out.println("Success");
		}
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
	}

}
