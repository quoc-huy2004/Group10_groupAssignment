package UserAndLogin;

import java.util.Date;

public class Employee extends User{
    private Date hireDate;
    private double salary;
    public Employee(String userID, String fullName, Date dateOfBirth, String address, String phone, String email, String userType, Date hireDate, double salary) {
        super(userID, fullName, dateOfBirth, address, phone, email, userType);
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeDetails() {
        return "ID: " + getUserID() + ", Name: " + getFullName();
    }

    public double calculateSalary() {
        return this.salary;
    }

    @Override
    public boolean login(String password) {
        return false;
    }

    @Override
    public void updateProfile(String fullName, String address, String phone, String email) {

    }
}
