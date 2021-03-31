package com.company.model.UserModel;

public class User {
    private int id;
    private String name;
    private String surname;
    private int password;
    private String address;
    private int phoneNumber;
    private String userName;
    private int internalPhoneNumber;

    public User(int id, String name, String surname, int password, String address,
                int phoneNumber, String userName, int internalPhoneNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.internalPhoneNumber = internalPhoneNumber;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSurname () {
        return surname;
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }

    public int getPassword () {
        return password;
    }

    public void setPassword (int password) {
        this.password = password;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public int getPhoneNumber () {
        return phoneNumber;
    }

    public void setPhoneNumber (int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName () {
        return userName;
    }

    public void setUserName (String userName) {
        this.userName = userName;
    }

    public int getInternalPhoneNumber () {
        return internalPhoneNumber;
    }

    public void setInternalPhoneNumber (int internalPhoneNumber) {
        this.internalPhoneNumber = internalPhoneNumber;
    }

    @Override
    public String toString () {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password=" + password +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", userName='" + userName + '\'' +
                ", internalPhoneNumber=" + internalPhoneNumber +
                '}';
    }
}
