package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      context.registerShutdownHook();

      HelloIndia objA = (HelloIndia) context.getBean("helloIndia");
//      objA.getMessage();
//      objA.getNum();
      objA.getChildMessage();
   }
}