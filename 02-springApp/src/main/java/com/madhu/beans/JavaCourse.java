package com.madhu.beans;

public class JavaCourse implements ICourses {
public JavaCourse() {
	System.out.println("JavaCourse object is created...");
}
	public boolean courseSelected() {
		System.out.println("java course is selected...");
		return true;
	}

}
