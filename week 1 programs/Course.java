package com.collections;

 class Course {
	 Integer id;
	 String name;
	 Double fee;
	 

	public Course(Integer id, String name, Double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}


@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}

}
