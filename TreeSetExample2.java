package com.collection.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		
		Set hashset = new HashSet();
		
		hashset.add(null);
		hashset.add(16);
		hashset.add(73);
		hashset.add(88);
		hashset.add(45);
		hashset.add(null);
		
		Set linkedHashset = new LinkedHashSet();
		
		linkedHashset.add(null);
		linkedHashset.add(16);
		linkedHashset.add(73);
		linkedHashset.add(88);
		linkedHashset.add(45);
		linkedHashset.add(null);
		
		
		Set treeSet = new TreeSet();
		
		treeSet.add(null);
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
		
				

	}

}
