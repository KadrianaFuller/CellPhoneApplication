package com.Pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    // Create a new Instance of a Cellphone
        CellPhone phone = new CellPhone();

    // Prompt use for CellPhone information

        System.out.println(" Please enter cell phone information: \n ");

        System.out.print("What is the serial number?");
        int serialNumber = in.nextInt();

        System.out.print("What model is the phone?");
        String model = in.next();


        System.out.print("Who is the carrier?");
        String carrier = in.next();


        System.out.print("What is the phone number?");
        String phoneNumber = in.next();


        System.out.print("Who is the owner?");
        String owner = in.next();


        phone.getPhoneNumber( phone);
        phone.getModel(model);
        phone.getCarrier(carrier);
        phone.getPhoneNumber(phone);
        phone.getOwner(owner);

        System.out.println("\n---------\n");

        phone.printPhoneInformation();












    }
}
