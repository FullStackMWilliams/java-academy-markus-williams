package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private boolean isWorking;


    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.isWorking = false;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void punchTimeCard(double time){
        if (!isWorking) {
            startTime = time;
            isWorking = true;
            System.out.println(name + " punched in at " + time);
        } else {
            double hours =  time - startTime;
            if (hours < 0) hours = 0;
            hoursWorked += hours;
            isWorking = false;
            System.out.println(name + " punched out at " + time + " (+" + hours + " hrs");
        }
    }

    public double getRegularHours() {
        return Math.min(40, hoursWorked );
    }
    public double getOverTimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overTimePay = getOverTimeHours() * payRate;
        return regularPay + overTimePay;
    }


}
