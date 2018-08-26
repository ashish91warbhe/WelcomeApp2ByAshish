package com.sathya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.WelcomeBean;

public class Test {

	public static void main(String[] args) {
		

		
		//start spring container
		ApplicationContext ct1=new 
       ClassPathXmlApplicationContext("com/sathya/config/config.xml");
		
		//get the bean object
		
		Object o=ct1.getBean("id1");
		
		WelcomeBean a=(WelcomeBean)o;
		
		System.out.println(a);
		
		
		
		
		
	}

}
