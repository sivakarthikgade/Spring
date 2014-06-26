package com.tutorialspoint;

public class HelloWorld {
   private String message;
   private int num;

   public HelloWorld() {
	   
   }
   
   public HelloWorld(String message, int num) {
	   this.message = message;
	   this.num = num;
   }
   
   public void initialize() {
	   System.out.println("In Initialize Method of HelloWorld!!");
//	   this.setMessage("1.5 1.5 1.5");
   }

   public void setMessage(String message){
      this.message  = message;
   }

   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
   
   public void setNum(int num) {
	   this.num = num;
   }
   
   public void getNum() {
	   System.out.println("Your Number : " + num);
   }

   public void finalize() {
	   System.out.println("In Finalize Method of HelloWorld!!!!");
   }
}