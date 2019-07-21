package com.test.prac;

public class RunnableExample {

	
	public static void main(String[] args) {
		
		Thread myLambdaThread = new Thread(()->System.out.println("printed inside lambda runnable"));
		myLambdaThread.run();
	}
		
}
