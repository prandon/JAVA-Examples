package com.training;
import java.util.*;
public class SalesEmployee extends Employee {
    private int sales;
    private double commisssion;
    private double netSalary;

    public SalesEmployee() {
        System.out.println("Default constructor of SalesEmployee is called");
        sales = 0;
        commisssion = 0;
        netSalary = 0;
    }

    public SalesEmployee(int empId, String name, double salary, int sales) {
        super(empId, name, salary);
        System.out.println("Parameterised constructor of SalesEmployee is called");
        this.sales = sales;
        commisssion = 0;
        netSalary = 0;
    }

    public void acceptSalesEmployeeDetails() {
        acceptEmployeeDetails();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sales amount");
        sales = input.nextInt();
    }

    public void calculateSalary(){
        System.out.println("CalculateSalary of wageEmployee is called");

    }
    public void displaySalesEmployeeDetails() {
        displayEmployeeDetails();
        System.out.println("Sales " + sales + " Commission " + commisssion + "Net Salary" + netSalary);
    }
}
