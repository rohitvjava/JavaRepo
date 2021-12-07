package com.collection.list;

import java.util.Comparator;

public class StudentWeightComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getWeight()-o2.getWeight();
		
	}

}
