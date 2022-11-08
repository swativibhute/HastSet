package com.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {


		TreeSet< String> set = new TreeSet<String>();
		set.add("abc");
		set.add("pqr");
		set.add("swati");
		set.add("manisha");
		
		for(String s :set) {
			System.out.println(s);
		}
		set.forEach(s ->{
			System.out.println(s);
		});
	}

}
