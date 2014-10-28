package lab0;

import java.util.Date;

/**
 *
 * @author Instlogin
 */
public class Startup {
    private String lastName;
    private String firstName;
    private Date hireDate;
    private int vacationDays;
    private String social;
    private boolean b;
    

    
    public static void main(String[] args) {
        Startup start = new Startup();

        Employee emp = new Employee(
            "John",
            "Doe",
            "24215425",
            start.hireDate,
            start.vacationDays);
         
        String fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        
    }
}
