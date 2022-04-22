package com.worksheet1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/worksheet1/configW1.xml");
		Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1);
        Employee employee2 = (Employee) context.getBean("employee2");
        System.out.println(employee2);
        Employee employee3 = (Employee) context.getBean("employee3");
        System.out.println(employee3);
        Employee employee4 = (Employee) context.getBean("employee4");
        System.out.println(employee4);

	}

}
