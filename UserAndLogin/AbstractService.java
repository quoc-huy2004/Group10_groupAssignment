package UserAndLogin;

import java.util.Date;

public abstract class AbstractService {
    private String serviceID;
    private Date serviceDate;
    private double serviceCost;

    public AbstractService(String serviceID, Date serviceDate) {
        this.serviceID = serviceID;
        this.serviceDate = serviceDate;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public abstract double calculateServiceCost();
    public abstract void displayServiceDetails();
}

class RepairService extends AbstractService {
    private String repairDetails;

    public RepairService(String serviceID, Date serviceDate, String repairDetails) {
        super(serviceID, serviceDate );
        this.repairDetails = repairDetails;
        this.setServiceCost(calculateServiceCost());
    }

    public String getRepairDetails() {
        return repairDetails;
    }

    public void setRepairDetails(String repairDetails) {
        this.repairDetails = repairDetails;
    }

    @Override
    public double calculateServiceCost() {
        return 30.0;
    }
    @Override
    public void displayServiceDetails() {
        System.out.println("Service ID: " + getServiceID());
        System.out.println("Service Date: " + getServiceDate());
        System.out.println("Service Cost: $" + getServiceCost());
        System.out.println("Repair Details: " + repairDetails);
        System.out.println("Calculate Service Cost: $" + calculateServiceCost());
    }

}
