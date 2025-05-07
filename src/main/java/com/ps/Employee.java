package com.ps;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;


   //pure getters and setters

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //Derived: getTotalPay; getRegularHours; getOvertimeHours;
    public double getRegularHours(){
        if(hoursWorked <= 40){
            return hoursWorked;
        }else{
            return 40;
        }
    }

    public double getOverTimeHours(){
        if(hoursWorked > 40){
            return hoursWorked-40;
        }else{
         return 0;
        }
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOverTimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }
}
