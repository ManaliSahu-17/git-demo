package com.git_demo.git_demo;
import java.util.*;
public class EmployeeMangementsystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the length of the array ");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n]; 
        for(int i =0;i<n;i++) {
        	System.out.println("Choose 1 for Full-time Employee  and 2 for part-time Employee");
        	int m = sc.nextInt();
        	
        	System.out.println("Enter Employee Code");
            String employeecode = sc.nextLine();
            System.out.print("Enter Employee Name");
            String name = sc.nextLine();
            System.out.print("Enter Year of Joining");
            String year = sc.nextLine();
            System.out.print("Enter Department");
            String department = sc.nextLine();
            System.out.print("Enter Designation");
            String designation = sc.nextLine();
            
            if(m ==1) {
            	System.out.println("Enter the 1 day Salary of the full-time employee");
            	float salary = sc.nextFloat();
            	emp[i]= new FullTimeEmployee(employeecode,name,year,department,designation,salary);
            	
            }
            else if(m==2) {
            	System.out.println("Enter the 1 hour Salary of the part-time employee");
            	float salary = sc.nextFloat();
            	System.out.println("Enter the hours of work done by the part-time employee in the month");
            	float hours = sc.nextFloat();
            	
            	emp[i]= new PartTimeEmployee(employeecode,name,year,department,designation,salary,hours);
            }
            else {
            	System.out.println("Wrong choice");
            	i--;
            }
        }
        
        for (Employee e : emp) {
            e.displayDetails();
            e.calculateSalary();
            System.out.println();
        }
		
	}

}

abstract class Employee{
	String employeeCode;
    String employeeName;
    String yearOfJoining;
    String department;
    String designation;
    
    public Employee(String employeeCode, String employeeName, String yearOfJoining, String department, String designation) {
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.yearOfJoining = yearOfJoining;
        this.department = department;
        this.designation = designation;
    }
	abstract void displayDetails();
	abstract void calculateSalary();
}

class FullTimeEmployee extends Employee{
	float empsalary;
	
	public FullTimeEmployee(String employeeCode, String employeeName, String yearOfJoining, String department, String designation, float salary) {
        super(employeeCode, employeeName, yearOfJoining, department, designation);
        this.empsalary = salary;
    }
	
	void displayDetails() {
		System.out.println("--Detail of the Full Time Employee--");
		System.out.println("1. EmployeeCode :"+employeeCode);
		System.out.println("2. EmployeeName :"+employeeName);
		System.out.println("3. YearOfJoining :"+yearOfJoining);
		System.out.println("4. Department :"+department);
		System.out.println("5. Designation :"+designation);
		calculateSalary();
		System.out.println("6. Slary:"+empsalary);
		
	}
	 void calculateSalary() {
		 empsalary = empsalary*30;
	    }
	
}


class PartTimeEmployee extends Employee
{
	float empsalary;
	float hours;
	
	public PartTimeEmployee(String employeeCode, String employeeName, String yearOfJoining, String department,String designation,float salary,float hours) 
	{
		super(employeeCode, employeeName, yearOfJoining, department, designation);
		this.empsalary = salary;
		this.hours = hours;
	}
	
	
	
	void displayDetails() {
		System.out.println("--Detail of the Part Time Employee--");
		System.out.println("1. EmployeeCode:"+employeeCode);
		System.out.println("2. EmployeeName:"+employeeName);
		System.out.println("3. YearOfJoining:"+yearOfJoining);
		System.out.println("4. Department:"+department);
		System.out.println("5. Designation:"+designation);
		System.out.println("6. Work of Work Done:"+hours);
		System.out.println("Rate of per Hour work is:"+empsalary);
		calculateSalary();
		System.out.println("7. Salary:"+empsalary);
		
	}
	 void calculateSalary() {
		 empsalary = empsalary*hours;
	    }
	
}










