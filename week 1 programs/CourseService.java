package com.collections;

import java.util.List;

interface CourseService {
	 String addCourse(Course c);
	 String deleteCourse(Integer cid);
	 String updateCourse(Integer cid);
	 List<Course> listCourses();

}
