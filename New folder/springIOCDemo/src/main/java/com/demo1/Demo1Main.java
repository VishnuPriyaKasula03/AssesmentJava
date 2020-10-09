package com.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1Main {

	public static void main(String[] args) 
	{
		//container---> life cycle of bean
		//can use two xml files as coma seperated or using import
		//<!-- \<import resource="spring-config2.xml"></import\> --> in xml file under  beans

		ApplicationContext context=new ClassPathXmlApplicationContext("/com/demo1/spring-config2.xml");
		//lazy-int="true" stops creating obj before bean
		//Eager loading--->loading even without calling bean
		Employee emp=(Employee) context.getBean("employee");
		/*emp.setEmpName("Welcome to Spring");
		emp.setEmpNo(12);*/
		
		System.out.println("Name:"+emp.getEmpName());
		System.out.println("No:"+emp.getEmpNo());
		System.out.println("Lastname :"+emp.getLast());
		
		Employee emp1=(Employee) context.getBean("employee");
		emp1.setEmpName("Two");
		emp1.setEmpNo(345);
		
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getEmpNo());//--->previous value will be printed
		System.out.println();
		Address addressObj=(Address)context.getBean("address");
		System.out.println("DoorNo :"+addressObj.getDoorno());
		System.out.println("City :"+addressObj.getCity());
		System.out.println("Street :"+addressObj.getStreet());
		
		System.out.println("Address from employee");
		System.out.println("Door No---->"+emp.getAdd().getDoorno());
		System.out.println("City---->"+emp.getAdd().getCity());
		
		
	    
		((AbstractApplicationContext) context).registerShutdownHook();

		 
		
		System.out.println("End");
	}

}
