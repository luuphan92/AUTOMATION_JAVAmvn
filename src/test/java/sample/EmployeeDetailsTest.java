package sample;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 3/16/17 23:17.
 */
public class EmployeeDetailsTest {
    EmployeeDetails employee = new EmployeeDetails();

    //test to check creating Employee
    @Test
    public void canCreateEmployee(){
        employee.setName("Tom");
        employee.setAge(30);
        employee.setMonthlySalary(2000);

        assertEquals("Tom",employee.getName());
        assertEquals(30,employee.getAge());
        assertEquals(2000,employee.getMonthlySalary(),0.0);
    }

}
