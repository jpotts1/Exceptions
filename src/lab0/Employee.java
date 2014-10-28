package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * 
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    private int maxDaysVacation = 28;
    private String firstName;
    private String lastName;
    private String social;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        social = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    public final int getDaysVacation() {
        return daysVacation;
    }

    public final void setDaysVacation(int daysVacation) {
        this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
       
        this.firstName = firstName;
    }

    public final Date getHireDate() {
        return hireDate;
    }

    public final void setHireDate(Date hireDate) {
        
        this.hireDate = hireDate;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        
        this.lastName = lastName;
    }

    public final String getSsn() {
        return social;
    }


    public void setSsn(String ssn) {
//        if(ssn == null || ssn.length() < 9){
//            throw new IllegalArgumentException();
//        }
//        ssn = ssn.replace("-", "");
//        try 
//        {
//            int intSsn = Integer.parseInt(ssn);
//        }
//        catch(NumberFormatException e)
//        {
//            throw new IllegalArgumentException();
//        }
        this.social = ssn;
    }
    
    
    
}
