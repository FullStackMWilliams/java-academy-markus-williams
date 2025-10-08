package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PayRollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.print("Enter the name of the employee file to process: ");
        String inputFile = scanner.nextLine().trim();

        System.out.print("Enter the name of the payroll file to create: ");
        String outputFile = scanner.nextLine().trim();

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line1;
            while ((line1 = reader.readLine()) !=null) {
                if (line1.toLowerCase().startsWith("id|")) {
                    continue;
                }
                String[] parts = line1.split("\\|");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double hours = Double.parseDouble(parts[2].trim());
                    double rate = Double.parseDouble(parts[3].trim());

                    employees.add(new Employee(id,name,hours,rate));
                }
            }
        }catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
            return;
        }

        if (outputFile.endsWith(".json")) {
            writeJson(employees, outputFile);
        }else {
            writeCsv(employees,outputFile);
        }

        System.out.println("Payroll file created successfully: " + outputFile);
        scanner.close();
    }
    private static void writeCsv(List<Employee> employees, String outputFile) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            writer.println("id|name|gross pay");
            for (Employee emp : employees) {
                writer.printf("%d|%s|%.2f%n", emp.getEmployeeID(), emp.getName(), emp.getGrossPay());
            }
        }catch (IOException e) {
            System.out.println("Error writing csv: " + e.getMessage());
        }
    }
    private static void writeJson(List<Employee> employees, String outputFile) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            writer.println("[");
            for (int i = 0; i < employees.size(); i++) {
                Employee emp = employees.get(i);
                writer.printf(" {\"id\": %d, \"name\": \"%s\",\"grossPay\": %.2f }",emp.getEmployeeID(), emp.getName(), emp.getGrossPay());
                if (i < employees.size() - 1) writer.println(",");
                else writer.println();
            }
            writer.println("]");
        }catch (IOException e) {
            System.out.println("Error writing JSON: " + e.getMessage());
        }
    }
}
