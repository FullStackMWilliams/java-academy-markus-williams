package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class PayRollCalculator {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        String line;
        double totalPayroll = 0.0;

        System.out.printf("%-10s %-25s %-10s%n", "ID","Name","Gross pay");
        System.out.println("==================================================");

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                if (tokens.length < 4) continue;

                int id = Integer.parseInt((tokens[0]));
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);

                double grossPay = employee.getGrossPay();
                totalPayroll += grossPay;

                System.out.printf("%-10d %-25s $%-10.2f%n", employee.getEmployeeID(),employee.getName(),employee.getGrossPay());
            }
            System.out.println("======================================");
            System.out.printf("%-36s $%-10.2f%n", "Total Payroll:",totalPayroll);

        }catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }catch (NumberFormatException e) {
            System.out.println("Error parsing number: " + e.getMessage());
        }
    }
}