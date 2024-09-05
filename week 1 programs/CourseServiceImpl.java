package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseServiceImpl implements CourseService {
	List<Course> courseList=new ArrayList<>();
	
	public String addCourse(Course c) {
		courseList.add(c);
		
		return "Course added successfully";
	}

	
	public String deleteCourse(Integer cid) {
		Iterator i=courseList.iterator();
		while(i.hasNext())
		{
			Course course=(Course)i.next();
			if(course.id==cid)
				i.remove();
		}
		
		return "removed successfully";
	}

	public String updateCourse(Integer cid) {
		Iterator i=courseList.iterator();
		while(i.hasNext())
		{
			Course course=(Course)i.next();
			if(course.id==cid)
				course.fee=course.fee+1000;
		}
		return "updated succcessfully";
	}


	public List<Course> listCourses() {
		
		return courseList;
	}

}
