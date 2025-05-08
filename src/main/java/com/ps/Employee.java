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

/*--- package com.ps;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void testPunchInAndPunchOut()
    {
        //arrange
        Employee person1 = new Employee("1","one","x",15);
        double person1StartTimeExpected = 8.00;
        double person1EndTimeExpected = 15.00;
        double totalTimeWorkExpected = 7.00;

        //act
        person1.punchIn(8.00);
        person1.punchOut(15.00);
        double totalWorkTimeActual = person1.getHoursWorked();
        double person1StartTimeActual = person1.getStartTime();
        double person1EndTimeActual = person1.getEndTime();

        //assert
        assertEquals(totalTimeWorkExpected,totalWorkTimeActual);
        assertEquals(person1StartTimeExpected,person1StartTimeActual);
        assertEquals(person1EndTimeExpected,person1EndTimeActual);
    }

} --*/
