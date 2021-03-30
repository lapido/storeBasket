package com.company.Employee;

public class Cashier extends UserEmployee {
    private double loginTime;
    private double logoutTime;

    public Cashier (String name, String surname, int password, String address, int phoneNumber, String userName, int internalPhoneNumber, double loginTime, double logoutTime) {
        super(name, surname, password, address, phoneNumber, userName, internalPhoneNumber);
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
    }

    public Cashier () {
        super();
    }

    public double getLoginTime () {
        return loginTime;
    }

    public void setLoginTime (double loginTime) {
        this.loginTime = loginTime;
    }

    public double getLogoutTime () {
        return logoutTime;
    }

    public void setLogoutTime (double logoutTime) {
        this.logoutTime = logoutTime;
    }

    @Override
    public String toString () {
        return "Cashier{}";
    }

    public Double baseSalary () {
        double baseSalary = 8.0 * workHours(loginTime,logoutTime);
        return baseSalary;
    }



    private Double workHours(double loginTime,double logoutTime){
        double workHours= logoutTime-loginTime;
        return  workHours;
    }
    private double Bonus(){
        if (workHours(loginTime,logoutTime) > 8) {
            double bonus = (workHours(loginTime, logoutTime) - 8) * 10;
            return bonus;
        }
        else {
            double bonus = 0;
            return bonus;
        }
    }
}

