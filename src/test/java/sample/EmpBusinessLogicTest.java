package sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 3/16/17 23:32.
 */
public class EmpBusinessLogicTest {
    private EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    private EmployeeDetails employee = new EmployeeDetails();

    //test to check appraisal
    @Test
    public void testCalculateAppraisal() {
        employee.setName("Tom");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        assertEquals(500, appraisal, 0.0);
    }

    // test to check yearly salary
    @Test
    public void testCalculateYearlySalary() {
        employee.setName("Tom");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double salary = empBusinessLogic.calculateYearlySalary(employee);
        assertEquals(96000, salary, 0.0);
    }

    @Test
    public void testCalculateAppraisalGreaterOrEqual10k() {
        employee.setName("Tom");
        employee.setAge(25);
        employee.setMonthlySalary(10000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        assertEquals(1000, appraisal, 0.0);
    }

    @Test
    public void testCalculateAppraisalLessThanOrEqual20k() {
        employee.setName("Tom");
        employee.setAge(25);
        employee.setMonthlySalary(20000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        assertEquals(1000, appraisal, 0.0);
    }

    @Test
    public void testCalculateAppraisalGreaterThan20k() {
        employee.setName("Tom");
        employee.setAge(25);
        employee.setMonthlySalary(20000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        assertEquals(3000, appraisal, 0.0);
    }

}
