package com.git_demo.git_demo;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList<>();
		ls.add(234);
		ls.add(500);
		ls.add(600);
		ls.add(780);
		ls.add(990);
		System.out.println("the ArrayList is:"+ls);
		
		int num = ls.remove(3);
		System.out.println("Removed element:"+num);
		
		ls.set(1,9);
		System.out.println("The second element is:"+ls.get(1));
		for(Integer i :ls) {
			System.out.println(i);
			
		}
		
		
		 ListIterator<Integer> itr = ls.listIterator();

	        System.out.println("Elements of list in backward direction:");
	        while (itr.hasPrevious()) {
	            System.out.println(itr.previous());

	}
	}

}
