package com.madhu.beans;

public class PythonCourse implements ICourses {
public PythonCourse() {
	System.out.println("Python course object is created...");
}
	public boolean courseSelected() {
		System.out.println("Python course is selected...");
		return true;
	}

}
