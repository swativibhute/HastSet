package com.hash;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetD {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Swati");
		set.add("Amey");
		set.add("Enaya");
		set.add("Amita");
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(5);
		set2.add(3);
		set2.add(2);
	
//		TreeSet<String> sortedset = new TreeSet<String>(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//
//				return -o1.compareTo(o2);
//			}
//			
//		});
//		
		TreeSet<String> set3 = new TreeSet<String>(new SortDescending());
		 set3.addAll(set);
		System.out.println( set3);
	}
}
