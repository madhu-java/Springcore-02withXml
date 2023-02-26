package com.madhu.beans;

public class CourseSelection {
	private ICourses course;
	public void setCourse(ICourses course) {
		this.course=course;
	}
	public void selectCourse() {
		boolean status=course.courseSelected();
		if(status) {
			System.out.println("course selected successfully");
		}else {
			System.out.println("failed to select");
		}
	}
	

}
