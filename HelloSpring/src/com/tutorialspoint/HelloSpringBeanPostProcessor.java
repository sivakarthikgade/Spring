package com.tutorialspoint;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;

public class HelloSpringBeanPostProcessor implements BeanPostProcessor {
 
   public Object postProcessBeforeInitialization(Object bean,
                 String beanName) throws BeansException {
//	   return null;
      System.out.println("BeforeInitialization : " + beanName);
//      ((HelloWorld)bean).setMessage("111");
      return bean;  // you can return any other object as well
   }

   public Object postProcessAfterInitialization(Object bean,
                 String beanName) throws BeansException {
      System.out.println("AfterInitialization : " + beanName);
//      ((HelloWorld)bean).setMessage("222");
      return bean;  // you can return any other object as well
   }
 
}