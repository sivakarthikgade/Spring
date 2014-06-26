package com.tutorialspoint;

public class HelloIndia  {

	private String childMessage;
	
	public HelloIndia() {
		
	}
	
	public void getChildMessage() {
		System.out.println("childMessage: "+childMessage);
	}

	public void setChildMessage(String childMessage) {
		this.childMessage = childMessage;
	}
	
}
