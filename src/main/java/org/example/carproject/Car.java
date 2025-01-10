package org.example.carproject;

public class Car {
    private String licensePlateNumber;
    private String name;
    private int year;

    public Car(String licensePlateNumber, String name, int year) {
        this.licensePlateNumber = licensePlateNumber;
        this.name = name;
        this.year = year;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
