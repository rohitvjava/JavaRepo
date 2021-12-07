package com.collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		
		
		Map<Integer,String> hashmap = new  HashMap();
		
		hashmap.put(1, "a");
		
		hashmap.put(5, "b");
		hashmap.put(28, "c");
		hashmap.put(8, "a");
		hashmap.put(2, "a");
		hashmap.put(1, "u");
		hashmap.put(1, "tt");
		
		System.out.println(hashmap);
	}

}
