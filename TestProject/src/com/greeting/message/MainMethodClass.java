package com.greeting.message;

public class MainMethodClass {

	public static void main(String[] args) {
		new MainMethodClass().greet();
		System.out.println("Greeted from the method tested succesfully.");

	}

	private void greet() {
		System.out.println("Hello world from method");

	}

}
