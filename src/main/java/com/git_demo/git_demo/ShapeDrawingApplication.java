package com.git_demo.git_demo;
import java.util.*;
public class ShapeDrawingApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		Shape[] s = new Shape[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the choice which shape u want? 1 for circle 2 for rectangle ");
			int m = sc.nextInt();
			if(m==1) {
				s[i] = new Circle();
			}
			else if(m==2) {
				s[i]= new Rectangle();
			}
			else {
				System.out.println("oops!! wrong choice");
				i--;
			}
		}
		
		for(Shape shape:s) {
			shape.draw();
		}
		
		
		

	}

}

abstract class Shape {
    
    abstract void draw();
}

class Circle extends Shape{
	void draw() {
		System.out.println("Drawing a circle");
	}
	
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing a recangle");
	}
	
}
