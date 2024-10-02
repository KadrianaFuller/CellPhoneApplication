package com.Pluralsight;

public class CellPhone {

    /*
    The class would have the following: serialNumber,
    model, carrier, phoneNumber,owner.
     */

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // Provide the Default values for all String data types in the constructor
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";


    }

    // Provide Getters
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public String getModel(String model) {
        return this.model;
    }

    public String getCarrier(String carrier) {
        return this.carrier;
    }

    public String getPhoneNumber(CellPhone phone) {
        return this.phoneNumber;

    }

    public String getOwner(String owner) {
        return this.owner;
    }

    // Provide Setters
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void printPhoneInformation() {
        System.out.printf("Serial Name: %d \n", this.serialNumber);
        System.out.printf("Model Name : %s \n", this.model);
        System.out.printf("Carrier Name:%s \n", this.carrier);
        System.out.printf("Phone Number : %s \n", this.phoneNumber);
        System.out.printf("Owner Name: %s \n", this.owner);
    }
}


