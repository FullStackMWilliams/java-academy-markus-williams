package com.pluralsight;
// Test passed first T!

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee emp;

    @BeforeEach
    void setup() {
        emp = new Employee(101, "Maria Lopez", "Front Desk", 20.00, 0);
    }

    @Test
    void testManualPunchInOut_CalculatesCorrectHours() {
        emp.punchTimeCard(9.0);   // punch in
        emp.punchTimeCard(17.5);  // punch out
        assertEquals(8.5, emp.getHoursWorked(), 0.01, "Hours worked should be 8.5");
    }

    @Test
    void testMultipleDaysAddsHours() {
        emp.punchTimeCard(9.0);
        emp.punchTimeCard(17.0);
        emp.punchTimeCard(10.0);
        emp.punchTimeCard(15.0);
        assertEquals(13.0, emp.getHoursWorked(), 0.01, "Total hours worked should accumulate across multiple days");
    }

    @Test
    void testOvertimeCalculation() {
        emp.punchTimeCard(8.0);
        emp.punchTimeCard(56.0); // simulate 48 hours of work
        assertEquals(48.0, emp.getHoursWorked(), 0.01);
        assertEquals(8.0, emp.getOverTimeHours(), 0.01, "Overtime should be total minus 40");
    }

    @Test
    void testTotalPayIncludesOvertime() {
        emp.punchTimeCard(9.0);
        emp.punchTimeCard(57.0); // simulate 48 hours worked
        double expectedPay = (40 * 20.0) + (8 * 20.0 * 1.5);
        assertEquals(expectedPay, emp.getTotalPay(), 0.01, "Pay should include overtime rate for hours > 40");
    }
}