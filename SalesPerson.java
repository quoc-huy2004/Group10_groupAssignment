package UserAndLogin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesPerson extends Employee {
    private final List<Transaction> salesHistory;
    public SalesPerson(String userID, String fullName, Date dateOfBirth, String address, String phone, String email, String userType, Date hireDate, double salary) {
        super(userID, fullName, dateOfBirth, address, phone, email, userType, hireDate, salary);
        this.salesHistory = new ArrayList<>();
    }

    public void processSale(Transaction transaction) {
        if (transaction != null && transaction.getSalespersonID().equals(this.getUserID())) {
            salesHistory.add(transaction);
            transaction.addTransaction();
        } else {
            System.out.println("Failed to process sale transaction");
        }
    }

   public List<Transaction> viewSaleHistory () {
       return new ArrayList<>(salesHistory);
   }

    @Override
    public String toString() {
        return "SalesPerson ID: " + getUserID() + "\n" +
                "Full Name: " + getFullName() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Hire Date: " + getHireDate() + "\n" +
                "Salary: " + getSalary();
    }
}
