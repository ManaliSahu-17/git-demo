package com.git_demo.git_demo;
import java.util.*;
public class Fivecityhashset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 Set<String> hashset = new HashSet<String>();
		 hashset.add("Nagpur");
		 hashset.add("Noida");
		 hashset.add("Mumbai");
		 hashset.add("Nagpur");
		 hashset.add("Kanpur");
		 
		 System.out.println("Elements in the HashSet of cities :"+hashset);
		 
		 boolean iscontaincity  = hashset.contains("Kanpur");
		 
		 System.out.println("Is Kanpur present in the Hashset: "+iscontaincity);
		 
		 
		 
		 boolean removedcity = hashset.remove("Nagpur");
		 
		 System.out.println("City Removed "+ removedcity);
		 System.out.println("Set after removing the elements: "+hashset);
		 
		
	}

}
