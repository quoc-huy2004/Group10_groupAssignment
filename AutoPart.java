package UserAndLogin;

public class AutoPart {
    private String partID;
    private String partName;
    private String manufacturer;
    private String partNumber;
    private String condition;
    private String notes;
    private int warranty;
    private double cost;

    public AutoPart(String partID, String partName, String manufacturer, String partNumber, String condition, int warranty, double cost, String notes) {
        this.partID = partID;
        this.partName = partName;
        this.manufacturer = manufacturer;
        this.partNumber = partNumber;
        this.condition = condition;
        this.notes = notes;
        this.warranty = warranty;
        this.cost = cost;
    }

    public String getPartID() {
        return partID;
    }

    public void setPartID(String partID) {
        this.partID = partID;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void addPart() {
        System.out.println("Part added successfully: " + this.getPartDetails());
    }

    public void updatePart(AutoPart updatedPart) {
        this.partID = updatedPart.getPartID();
        this.partName = updatedPart.getPartName();
        this.manufacturer = updatedPart.getManufacturer();
        this.partNumber = updatedPart.getPartNumber();
        this.condition = updatedPart.getCondition();
        this.warranty = updatedPart.getWarranty();
        this.cost = updatedPart.getCost();
        this.notes = updatedPart.getNotes();
        System.out.println("Part updated successfully: " + this.getPartDetails());
    }

    public void deletePart() {
        System.out.println("Part deleted successfully: " + this.partID);
    }

    public String getPartDetails() {
        return "ID Part: " + partID + ", Part Name: " + partName + ", Manufacturer: " + manufacturer
                + ", Part Number: " + partNumber + ", Condition: " + condition
                + ", Warranty: " + warranty + " months, Cost: $" + cost + ", Notes: " + notes;
    }

    public void displayPartDetails() {
        System.out.println("Part details: ");
        System.out.println(getPartDetails());
    }
}
