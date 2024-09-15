package UserAndLogin;

import java.util.Date;

public abstract class User extends AbstractPerson{
    protected String password;
    private String userID;
    private String email;
    private String userType;
    public User(String userID, String fullName, Date dateOfBirth, String address, String phone, String email, String userType) {
        super(fullName, dateOfBirth, address, phone);
        this.userID = userID;
        this.email = email;
        this.userType = userType;
    }

    public String getUserID() {
        return userID;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public boolean login() {
        return true;
    }

    public abstract boolean login(String password);

    @Override
    public void logout() {

    }

    @Override
    public void updateProfile() {

    }

    @Override
    public double calculateServiceCost() {
        return 0;
    }

    public void viewProfile () {

    }

    public abstract void updateProfile(String fullName, String address, String phone, String email);
}
