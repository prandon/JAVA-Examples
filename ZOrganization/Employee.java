package com.training;
import java.util.*;
/**
 * Created by Blossoms on 18-08-2017.
 */
public class Employee {
    private int empId;
    private String name;
    private double salary;


    public Employee(){
        System.out.println("Default constructor of Employee is called");
        empId=0;
        name="";
        salary=0;
    }

    public Employee(int empId,String name,double salary){
        System.out.println("Parameterised constructor of Employee is called");
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }

    public void acceptEmployeeDetails(){
        System.out.println("Enter empId,name,salary");
        Scanner input=new Scanner(System.in);
        empId=input.nextInt();
        name=input.nextLine();
        salary=input.nextDouble();
    }

    public void calculateSalary(){
        System.out.println("calculateSalary() of Employee class is called");
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee Details are");
        System.out.println("\n EmpId"+empId+"Name "+name+"Salary "+salary);
    }

}
