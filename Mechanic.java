package UserAndLogin;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mechanic extends Employee implements Servicable {
    private List<ServiceHistory> assignedServices;
    public Mechanic(String userID, String fullName, Date dateOfBirth, String address, String phone, String email, String userType, Date hireDate, double salary) {
        super(userID, fullName, dateOfBirth, address, phone, email, userType, hireDate, salary);
        this.assignedServices = new ArrayList<>();
    }

   public void performService (UserAndLogin.ServiceHistory service) {
       System.out.println("Mechanic is implementing services for Service ID: " + service.getServiceID());
       assignedServices.add(service);
   }

    @Override
    public void updateServiceDetails() {
        System.out.println("Mechanic is updating service details.");

    }

    public List<UserAndLogin.ServiceHistory> viewAssignedServices() {
        return null;
    }

    private List<ServiceHistory> assignedServices() {
        return assignedServices;
    }

    public void updateServiceStatus(UserAndLogin.ServiceHistory service, String newStatus) {
       service.setNotes(newStatus);
       System.out.println("Mechanic is updating service status for Service ID: " + service.getServiceID());
   }

    public void displayAssignedServices() {
        for (ServiceHistory service : assignedServices) {
            System.out.println(service.getServiceDetails());
        }
    }
}
