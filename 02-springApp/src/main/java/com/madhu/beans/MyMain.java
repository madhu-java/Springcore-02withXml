package com.madhu.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
CourseSelection course=(CourseSelection) context.getBean("co","CourseSelection.class");
course.selectCourse();
	}

}
