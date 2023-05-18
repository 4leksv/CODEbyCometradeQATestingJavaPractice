package OopPrincipi;

import java.security.PublicKey;

public class Employee extends Person {

    private  String employeeId;
    private int yearsInService;

    public Employee() {
        super(50);
    }
    public Employee(String employeeId, int yearsInService) {
        super(50);
        this.setEmployeeId(employeeId);
        this.setYearsInService(yearsInService);
        System.out.println("Child constructor is executed");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getYearsInService() {
        return yearsInService;
    }

    public void setYearsInService(int yearsInService) {
        this.yearsInService = yearsInService;
    }



}
