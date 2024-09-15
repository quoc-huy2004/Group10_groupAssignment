package UserAndLogin;

import java.util.Date;

public class Manager extends Employee {
    private String department;
    public Manager(String userID, String fullName, Date dateOfBirth, String address, String phone, String email, String userType, Date hireDate, double salary, String department) {
        super(userID, fullName, dateOfBirth, address, phone, email, userType, hireDate, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void assignTask(Employee employee, String task) {
        System.out.println("Assigning task: " + task + " to employee: " + employee.getFullName());
    }

    public void viewReports () {
        System.out.println("View reports");
    }

    public void approveTransaction (Transaction transaction) {
        System.out.println("Approving transaction: " + transaction);
    };


}
