package ca.rhythmtech;

import ca.rhythmtech.lab09.jpa.data.EmployeeFacade;
import ca.rhythmtech.lab09.jpa.entity.Employee;

import javax.ejb.EJB;

/**
 * Hello world!
 *
 */
public class App 
{

    public static final String EMP_ID = "A00057006";

    public static void main( String[] args )
    {
        EmployeeFacade employeeFacade = new EmployeeFacade();

        Employee emp = employeeFacade.getEmployeeById("A00066666");

        System.out.println("Employee retrieved...");
        System.out.println(emp);

    }

}
