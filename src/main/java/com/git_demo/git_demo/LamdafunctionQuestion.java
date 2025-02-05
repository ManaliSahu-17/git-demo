package com.git_demo.git_demo;
import java.util.*;

@FunctionalInterface
interface StringProcessor {
    String process(String str);
}


public class LamdafunctionQuestion {
	public static void main(String[]args) {
		List<String> name = new ArrayList<>(Arrays.asList("Manali", "Riya", "bhavna", "sumit", "manya"));
        
        
			name.sort((s1, s2) -> s2.compareToIgnoreCase(s1));
        System.out.println("Sorted in reverse alphabetical order: " + name);
        
        
        StringProcessor toUpperCaseProcessor = str -> str.toUpperCase();
        
        
        List<String> upperCase = new ArrayList<>();
        for (String n : name) {
            upperCase.add(toUpperCaseProcessor.process(n));
        }
        
        System.out.println("Uppercase words: " + upperCase);
	}

}
