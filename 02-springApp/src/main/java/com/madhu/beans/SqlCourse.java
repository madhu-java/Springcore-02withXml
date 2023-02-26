package com.madhu.beans;

public class SqlCourse implements ICourses {
public SqlCourse() {
	System.out.println("Sql course oject is created...");
}
	public boolean courseSelected() {
		System.out.println("Sql course is selected...");
		return true;
	}

}
