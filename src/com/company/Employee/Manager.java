package com.company.Employee;

public class Manager extends UserEmployee {
    private int pin;

    public Manager (String name, String surname, int password, String address, int phoneNumber, String userName, int internalPhoneNumber, int pin) {
        super(name, surname, password, address, phoneNumber, userName, internalPhoneNumber);
        this.pin = pin;
    }

    public Manager (int pin) {
        this.pin = pin;
    }

    public Manager () {

    }

    public int getPin () {
        return pin;
    }

    public void setPin (int pin) {
        this.pin = pin;
    }

    @Override
    public String toString () {
        return "Manager{" +
                "pin=" + pin +
                '}';
    }
}
