package com.pluralsight;

public class Employee {

    private int employeeID;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeID, String name, double hoursWorked, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getGrossPay() {
        double regularHours = Math.min(hoursWorked, 40);
        double overTimeHours = Math.max(hoursWorked - 40,0);
        return (regularHours * payRate) + (overTimeHours * payRate * 1.5);
    }
}

