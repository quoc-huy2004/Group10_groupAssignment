package UserAndLogin;

import java.util.Date;

public class Client extends User {
    private double totalSpending;
    private String membershipLevel; // Silver, Gold, Platinum
    public Client(String userID, String fullName, Date dateOfBirth, String address, String phone, String email, String userType) {
        super(userID, fullName, dateOfBirth, address, phone, email, userType);
        this.totalSpending = 0;
        this.membershipLevel = "Regular";
    }

    public void updateMembershipLevel() {
        if (totalSpending > 250000000) {
            membershipLevel = "Platinum";
        } else if (totalSpending > 100000000) {
            membershipLevel = "Gold";
        } else if (totalSpending > 30000000) {
            membershipLevel = "Silver";
        } else {
            membershipLevel = "Regular";
        }
    }

    public void viewTransactionHistory() {
        // Logic to view transaction history
    }

    public void viewServiceHistory() {
        // Logic to view service history
    }

    @Override
    public boolean login(String password) {
        return this.password.equals(password);
    }

    @Override
    public void logout() {
        System.out.println("Client " + getFullName() + " logged out.");
    }

    @Override
    public void updateProfile(String fullName, String address, String phone, String email) {
        this.setFullName(fullName);
        this.setAddress(address);
        this.setPhone(phone);
        this.setEmail(email);
        System.out.println("Client profile updated.");
    }
//   public List<SaleTransaction> viewServiceHistory(){
//        return new ArrayList<>();
//    }
//
//    public List<UserAndLogin.ServiceHistory> viewServiceHistory() {
//
//        return new ArrayList<>();
//   }
//
//    public void requestService() {
//
//    }

}


