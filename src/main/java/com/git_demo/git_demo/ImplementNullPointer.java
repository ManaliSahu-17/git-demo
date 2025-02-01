package com.git_demo.git_demo;

import java.util.*;


import java.util.Scanner;

public class ImplementNullPointer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id");
        String empId = sc.nextLine(); 
        
           if (empId == null || empId.equals("")) {
               
               empId = null;
           }

        try {
            
            
            if (empId.equals(2001)) { 
                System.out.println("Employee Id matched with given id");
            } 
            else {
                System.out.println("Not matched the employee id");
            }
        } 
        catch (NullPointerException e) {
        	System.out.println("NullPointerException occured"); 
            
        } 
        finally {
            System.out.println("Checking whether employee exit in the organization or not"); 
        }
    }
}



	

