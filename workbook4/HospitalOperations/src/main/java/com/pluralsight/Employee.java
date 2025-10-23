package com.pluralsight;

import java.time.LocalDateTime;

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

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public String getDepartment() {
        return department;
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

    public void punchTimeCard() {
        LocalDateTime now = LocalDateTime.now();
        double currentTime = now.getHour() + (now.getMinute() / 60.0);

        if (!isWorking) {
            startTime = currentTime;
            isWorking = true;
            System.out.printf("%s Automatically punched in at %.2f%n", name, currentTime);
        } else {
            double hours = currentTime - startTime;
            if (hours < 0) hours = 0;
            hoursWorked += hours;
            isWorking = false;
            System.out.printf("%s Automatically punched out at %.2f (+%.2f hrs)%n", name, currentTime,hours);
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