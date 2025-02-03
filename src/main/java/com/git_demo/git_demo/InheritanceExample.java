package com.git_demo.git_demo;
import java.util.*;
public class InheritanceExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Book and 2 for Magzine");
		int n = sc.nextInt();
		if(n>0) {
			if(n==1) {
				Book b = new Book();
				b.DetailofBooksMagzine();
				b.DetailofBook();
			}
			else if(n==2) {
				Magzine m = new Magzine();
				m.DetailofBooksMagzine();
				m.DetailofMagzine();
			}
		}
		else {
			System.out.println("Please enter the correct choice");
		}
		
		
	}

}
class BaseBookDetail{
	String title,Author;
	String yearofpublication;
	public BaseBookDetail() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the title of the Book/Magzine");
        this.title = sc.nextLine();
        System.out.println("Enter the Author Name ");
        this.Author = sc.nextLine();
        System.out.println("Enter the  Year of Publication ");
        this.yearofpublication = sc.nextLine();
        
	}
	public void DetailofBooksMagzine() {
		System.out.println("Title of Book/Magzine is:"+title);
		System.out.println("Author of the Book/Magzine:"+ Author);
		System.out.println("Year Of Publication:"+yearofpublication);
	}

}

class Book extends BaseBookDetail{
	String genre;
	public Book() {
        super(); 
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Genre of the Book");
        this.genre = sc.nextLine();
    }
	
	public void DetailofBook() {
		System.out.println("The genre of this book is :"+genre);
	}
}

class Magzine extends BaseBookDetail{
	int issuenum;
	public Magzine() {
        super(); 
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Issue Number of the Magzine");
        this.issuenum = sc.nextInt();
    }
	
	public void DetailofMagzine() {
		System.out.println("The issue number of this magzine is :"+issuenum);
	}
}

