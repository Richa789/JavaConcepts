package practice;

public class EmployeeDetails {
    String employeeName;
    int employeeId;
    public EmployeeDetails(String ename, int eid) {
        employeeName = ename;
        employeeId = eid;
    }
    public static void main(String[] args) {
        EmployeeDetails employeedetails = new EmployeeDetails("John",1234);
        System.out.println("First employee's name is "+ employeedetails.employeeName +" and his employee id is "+employeedetails.employeeId);
        EmployeeDetails secondemployeedetail = new EmployeeDetails("Sneha",5678);
        System.out.println("Second employee's name is "+secondemployeedetail.employeeName +" and her employee id is "+ secondemployeedetail.employeeId);

    }
}
