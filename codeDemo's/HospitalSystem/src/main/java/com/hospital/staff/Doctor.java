package com.hospital.staff;

public class Doctor extends StaffMember {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        super();
        this.name = name;
        this.specialization = specialization;
    }

    public void introduce() {
        System.out.println("Dr. " + name + " - Specialization: " + specialization);
    }
}
