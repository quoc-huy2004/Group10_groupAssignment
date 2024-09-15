package UserAndLogin;

import java.util.Date;

public abstract class AbstractPerson {
    private String fullName;
    private Date dateOfBirth;
    private String address;
    private String phone;
    protected String serviceID;
    protected Date serviceDate;
    protected double serviceCost;

    public AbstractPerson(String fullName, Date dateOfBirth, String address, String phone) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDob(Date dob) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public abstract boolean login();
    public abstract void logout();
    public abstract void updateProfile();
    public abstract double calculateServiceCost();
}
