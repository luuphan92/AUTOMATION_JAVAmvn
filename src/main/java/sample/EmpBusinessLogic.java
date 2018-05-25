package sample;

/**
 * Created by user on 3/16/17 23:01.
 */
public class EmpBusinessLogic {
    // Calculate the yearly salary of employee
    public double calculateYearlySalary(EmployeeDetails employeeDetails) {
        double yearlySalary = 0;
        yearlySalary = employeeDetails.getMonthlySalary() * 12;
        return yearlySalary;
    }

    // Calculate the appraisal amount of employee
    public double calculateAppraisal(EmployeeDetails employeeDetails) {
        double appraisal = 0;
        double monthlySalary= employeeDetails.getMonthlySalary();

        if(monthlySalary < 10000){
            appraisal = 500;
        }
        else if((monthlySalary >= 10000) && (monthlySalary <= 20000)){
            appraisal = 1000;
        }
        else {
            appraisal = 3000;
        }
        return appraisal;
    }
}
