package com.collections;

import java.util.List;

public class CourseDemo {
	public static void main(String[] args) {
		Course c1=new Course(40,"Angular",5000.00);
		Course c2=new Course(50,"React",6000.00);
		CourseService cs=new CourseServiceImpl();
		System.out.println(cs.addCourse(c1));
		System.out.println(cs.addCourse(c2));
		List<Course> returnedList=cs.listCourses();
		for(Course c:returnedList)
			System.out.println(c);
		System.out.println(cs.deleteCourse(50));
		System.out.println(cs.updateCourse(40));
		for(Course c:returnedList)
			System.out.println(c);
	}

}
