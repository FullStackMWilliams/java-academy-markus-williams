package com.pluralsight;

public class CellPhone {
    // Exercise: Cellphone Application


//     Data needed to be collected:

    // Serial number (ex: 100000 - 9999999)
    private int serialNumber;
    // model (ex:IPhone X)
    private String modelNumber;
    // Carrier (ex: AT&T)
    private String carrier_Provider;
    // PhoneNumber (ex:800-555-5555)
    private String phoneNumber;
    // owner (ex:Dana wyatt)
    private String owerFullName;

// Add a parameterless constructor. Provide the following default values for all string data types in the constructor

    public CellPhone() {

        // serialNumber = 0
        this.serialNumber = 0;

        // model = ""
        this.modelNumber = "";

        // carrier = ""
        this.carrier_Provider = "";

        // phoneNumber = ""
        this.phoneNumber = "";

        // ower = ""
        this.owerFullName = "";
    }

    /*    Provide getter and setter methods for all 5 data members. */

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getCarrier_Provider() {
        return carrier_Provider;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwerFullName() {
        return owerFullName;
    }

    /* Here will put the setters */

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setCarrier_Provider(String carrier_Provider) {
        this.carrier_Provider = carrier_Provider;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwerFullName(String owerFullName) {
        this.owerFullName = owerFullName;
    }
}



