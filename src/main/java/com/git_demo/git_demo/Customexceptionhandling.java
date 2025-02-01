package com.git_demo.git_demo;
import java.util.*;
public class Customexceptionhandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Mobile number");
	    String phn = sc.nextLine();
	    try {
            
            if (phn.length() < 10) {
                throw new Customexcep("ohh no!! Phone number is not correct");
            }
            
        } 
	    catch (Customexcep e) {
            System.out.println(e.getMessage());
        }
	    finally {
	    	System.out.println("Your Details");
	    	System.out.println("Enter your name");
	    	String name = sc.nextLine();
	    	System.out.println("Enter your age");
	    	int age = sc.nextInt();
	    	System.out.println("Thank You for the details \"Have a Nice Day!!\"");
	    }
	
		

	}

}
class Customexcep extends Exception{
	public Customexcep(String msg) {
        super(msg);
    }
	
}
