package com.collection.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		Set hashset = new HashSet();
		
		hashset.add(45);
		hashset.add(16);
		hashset.add(73);
		hashset.add(88);
		hashset.add(45);
		
		
		Set linkedHashset = new LinkedHashSet();
		
		linkedHashset.add(45);
		linkedHashset.add(16);
		linkedHashset.add(73);
		linkedHashset.add(88);
		linkedHashset.add(45);
		
		
		Set treeSet = new TreeSet();
		
		treeSet.add(45);
		treeSet.add(16);
		treeSet.add(73);
		treeSet.add(88);
		treeSet.add(45);
		
		//output
		
		System.out.println(hashset);
		//
		System.out.println(linkedHashset);
		//		
		System.out.println(treeSet);
		
		System.out.println("Custom class example");
		
		Student s1 = new Student(20, "rohit", 56);
		Student s2 = new Student(46, "mohit", 61);
		Student s3 = new Student(27, "sobhit", 72);
		Student s4 = new Student(33, "aman", 56);
		Student s5 = new Student(20, "rohit", 56);
		
		//
		
		Set hashsetStudent = new HashSet();
		hashsetStudent.add(s1);
		hashsetStudent.add(s2);
		hashsetStudent.add(s3);
		hashsetStudent.add(s4);
		hashsetStudent.add(s5);
		
		Set linkedHashsetStudent = new LinkedHashSet();
		
		linkedHashsetStudent.add(s1);
		linkedHashsetStudent.add(s2);
		linkedHashsetStudent.add(s3);
		linkedHashsetStudent.add(s4);
		linkedHashsetStudent.add(s5);
		
		Set treeSetStudent = new TreeSet();
		
		treeSetStudent.add(s1);
		treeSetStudent.add(s2);
		treeSetStudent.add(s3);
		treeSetStudent.add(s4);
		treeSetStudent.add(s5);
		
		//output
		
		System.out.println(hashsetStudent);
		//
		System.out.println(linkedHashsetStudent);
		//		
		System.out.println(treeSetStudent);
		
		
		
		
		

	}

}
