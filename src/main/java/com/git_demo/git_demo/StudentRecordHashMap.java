package com.git_demo.git_demo;
import java.util.*;
public class StudentRecordHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Riya");
		map.put(2, "Arpit");
		map.put(3, "Spana");
		map.put(4, "kriti");
		map.put(5, "Gaurav");
		map.put(6, "Bhavesh");
		
		System.out.println("All Students in HashMap: "+map.entrySet());
		 String name = map.get(1);
		 System.out.println("Roll No student name is: "+name);
		 
		String removestudent = map.remove(1);
		System.out.println("Remove Student:"+removestudent);
		 for (Integer key : map.keySet()) {
	            System.out.println("Roll no: " + key + ", Name: " + map.get(key));
	        }

	}

}
