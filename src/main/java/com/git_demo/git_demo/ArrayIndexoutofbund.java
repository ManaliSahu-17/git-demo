package com.git_demo.git_demo;
import java.util.*;

public class ArrayIndexoutofbund {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of array should be less than or equal to 5");
        int n = sc.nextInt();
        
        if (n > 5) {
            System.out.println("Enter a number less than or equal to 5");
            return;
        }
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        try {
            
            int a = arr[8]; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        }
    }
}

