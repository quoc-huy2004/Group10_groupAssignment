package UserAndLogin;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Transaction {
    private String transactionID;
    private Date transactionDate;
    private String clientID;
    private String salespersonID;
    private List<Object> purchasedItems; // Things can be UserAndLogin.AutoPart or Car
    private double discount;
    private double totalAmount;
    private String notes;

    public Transaction(String transactionID, Date transactionDate, String clientID, String salespersonID, List<AutoPart> purchasedItems, double discount, double totalAmount, String notes) {
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.clientID = clientID;
        this.salespersonID = salespersonID;
        this.purchasedItems = Collections.singletonList(purchasedItems);
        this.discount = discount;
        this.totalAmount = totalAmount;
        this.notes = notes;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public String getClientID() {
        return clientID;
    }

    public String getSalespersonID() {
        return salespersonID;
    }

    public List<Object> getPurchasedItems() {
        return Collections.singletonList(purchasedItems);
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getNotes() {
        return notes;
    }

    public void addTransaction () {
        System.out.println("Transaction added:" + this.transactionID);
    }

    public String getTransactionDetails() {
        return "Transaction ID: " + transactionID + "-" +
                "Transaction Date: " + transactionDate + "-" +
                "Client ID: " + clientID + "-" +
                "Salesperson ID: " + salespersonID + "-" +
                "Purchased Items: " + purchasedItems + "-" +
                "Discount: " + discount + "-" +
                "Total Amount: " + totalAmount + "-" +
                "Notes: " + notes + "-";
    }

    public void updateTransactionDetails(String clientID, List<Object> purchasedItems, double discount, double totalAmount, String notes) {
        this.clientID = clientID;
        this.purchasedItems = purchasedItems;
        this.discount = discount;
        this.totalAmount = totalAmount;
        this.notes = notes;
        System.out.println("Transaction details updated successfully.");
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionID + "\n" +
                "Transaction Date: " + transactionDate + "\n" +
                "Client ID: " + clientID + "\n" +
                "Salesperson ID: " + salespersonID + "\n" +
                "Purchased Items: " + purchasedItems + "\n" +
                "Discount: " + discount + "\n" +
                "Total Amount: " + totalAmount + "\n" +
                "Notes: " + notes;
    }
}
