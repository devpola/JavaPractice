package oop8_static;

public class EmployeeTest {

    public static void main(String[] args){

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("Minsu Kim");

        Employee employeeLee = new Employee();
        employeeKim.setEmployeeName("Minsu Lee");

        System.out.println(employeeKim.getEmployeeName() + "의 사번은 " + employeeKim.getEmployeeId());
        System.out.println(employeeLee.getEmployeeName() + "의 사번은 " + employeeLee.getEmployeeId());
    }
}
