package UserAndLogin;

import java.util.Date;
import java.util.List;
    public class ServiceHistory implements Servicable {
        private String serviceID;
        private Date serviceDate;
        private String clientID;
        private String mechanicID;
        private String serviceType;
        private List<AutoPart> replacedParts;
        private double serviceCost;
        private String notes;

        public ServiceHistory(String serviceID, Date serviceDate, String clientID, String mechanicID, String serviceType, List<AutoPart> replacedParts, double serviceCost, String notes) {
            this.serviceID = serviceID;
            this.serviceDate = serviceDate;
            this.clientID = clientID;
            this.mechanicID = mechanicID;
            this.serviceType = serviceType;
            this.replacedParts = replacedParts;
            this.serviceCost = serviceCost;
            this.notes = notes;
        }

        // Getters and setters
        public String getServiceID() { return serviceID; }
        public void setServiceID(String serviceID) { this.serviceID = serviceID; }
        public Date getServiceDate() { return serviceDate; }
        public void setServiceDate(Date serviceDate) { this.serviceDate = serviceDate; }
        public String getClientID() { return clientID; }
        public void setClientID(String clientID) { this.clientID = clientID; }
        public String getMechanicID() { return mechanicID; }
        public void setMechanicID(String mechanicID) { this.mechanicID = mechanicID; }
        public String getServiceType() { return serviceType; }
        public void setServiceType(String serviceType) { this.serviceType = serviceType; }
        public List<AutoPart> getReplacedParts() { return replacedParts; }
        public void setReplacedParts(List<AutoPart> replacedParts) { this.replacedParts = replacedParts; }
        public double getServiceCost() { return serviceCost; }
        public void setServiceCost(double serviceCost) { this.serviceCost = serviceCost; }
        public String getNotes() { return notes; }
        public void setNotes(String notes) { this.notes = notes; }
        public void addService() {
            System.out.println("Service added successfully.");
        }


        public String getServiceDetails() {
            StringBuilder details = new StringBuilder();
            details.append("Service ID: ").append(serviceID).append("\n");
            details.append("Service Date: ").append(serviceDate).append("\n");
            details.append("Client ID: ").append(clientID).append("\n");
            details.append("Mechanic ID: ").append(mechanicID).append("\n");
            details.append("Service Type: ").append(serviceType).append("\n");
            details.append("Service Cost: $").append(serviceCost).append("\n");
            details.append("Notes: ").append(notes).append("\n");

            details.append("Replaced Parts:\n");
            for (AutoPart part : replacedParts) {
                details.append("  - ").append(part.getPartName()).append(" (ID: ").append(part.getPartID()).append(")\n");
            }
            return details.toString();
        }


        public double calculateServiceCost() {
            double totalCost = 0;
            for (AutoPart part : replacedParts) {
                totalCost += part.getCost();
            }
            return totalCost;
        }

        @Override
        public void performService(ServiceHistory service) {
            System.out.println("Performing service for Service ID: " + service.getServiceID());
        }

        public void updateServiceDetails() {
            System.out.println("Service details updated.");
        }
    }

