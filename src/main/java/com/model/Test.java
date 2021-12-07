package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("bean.xml");
		
		Student s=(Student) apc.getBean("stud");
		
		System.out.println(s.getRollno()+" "+s.getName()+" "+s.getAddr());
		
		Student s1=(Student) apc.getBean("stud1");
		System.out.println(s1.getRollno()+" "+s1.getName()+" "+s1.getAddr());
		
		Student s2=(Student) apc.getBean("stud3");
		System.out.println(s2.getRollno()+" "+s2.getName()+" "+s2.getAddr());

	}

}
