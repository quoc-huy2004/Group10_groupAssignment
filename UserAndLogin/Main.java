package UserAndLogin;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Main {
    private Map<String, User> users;
    private List<AutoPart> autoParts;
    private List<ServiceHistory> serviceHistories;
    private List<Car> cars;
    private List<Transaction> transactions;

    public Main() {
        users = new HashMap<>();
        autoParts = new ArrayList<>();
        serviceHistories = new ArrayList<>();
        transactions = new ArrayList<>();
        cars = new ArrayList<>();
        userSamples();
        partSamples();
        serviceSamples();
        carSamples();
        makeSampleTransactions();
    }

    public void userSamples() {
        users.put("manager", new Manager("manager-01", "Manager Name", new Date(), "123 Manager St",
                "11234567", "manager@gmail.com", "Manager", new Date(), 5000, "Management"));
        users.put("salesperson", new SalesPerson("salesperson-01", "Salesperson Name", new Date(), "123 Sales St",
                "21234567", "sales@gmail.com", "Salesperson", new Date(), 3000));
        users.put("mechanic", new Mechanic("mechanic-01", "Mechanic Name", new Date(), "123 Mechanic St",
                "31234567", "mechanic@gmail.com", "Mechanic", new Date(), 2500));
        users.put("client", new Client("client-01", "Client Name", new Date(), "123 Client St",
                "41234567", "client@gmail.com", "Client"));
    }

    public void partSamples() {
        autoParts.add(new AutoPart("01", "Big plastic box mounted on the trunk of the car", "Auto136", "A01", "New", 24, 40, "Add plastic trunk for travel."));
        autoParts.add(new AutoPart("02", "Big carbon fiber box mounted on the trunk of the car", "Auto136", "A02", "New", 24, 60.99, "Updated the trunk."));
        autoParts.add(new AutoPart("03", "Leather seats for luxury cars", "Auto136", "A03", "New", 10, 200, "Upgrade seats for luxury experience."));
        autoParts.add(new AutoPart("04", "All-weather floor mats", "Auto136", "A04", "New", 30, 80, "Protect floors from dirt and water."));
        autoParts.add(new AutoPart("05", "High-performance brake pads", "Auto136", "A05", "New", 15, 120, "Improves braking performance."));
        autoParts.add(new AutoPart("06", "Premium oil filter", "Auto136", "A06", "New", 50, 20, "Enhances engine protection."));
        autoParts.add(new AutoPart("07", "LED headlights", "Auto136", "A07", "New", 10, 150, "Bright and energy-efficient headlights."));
        autoParts.add(new AutoPart("08", "Navigation system", "Auto136", "A08", "New", 5, 800, "Advanced GPS and navigation system."));
        autoParts.add(new AutoPart("09", "Rearview camera", "Auto136", "A09", "New", 20, 100, "Improves reversing safety."));
        autoParts.add(new AutoPart("10", "Roof rack", "Auto136", "A10", "New", 8, 250, "Carry extra cargo on the roof."));
        autoParts.add(new AutoPart("11", "Tinted windows", "Auto136", "A11", "New", 12, 180, "Reduces heat and glare."));
        autoParts.add(new AutoPart("12", "Leather steering wheel cover", "Auto136", "A12", "New", 20, 50, "Adds comfort and style to steering wheel."));
        autoParts.add(new AutoPart("13", "Battery charger", "Auto136", "A13", "New", 25, 60, "Charges car battery quickly."));
        autoParts.add(new AutoPart("14", "Car cover", "Auto136", "A14", "New", 18, 90, "Protects car from dust and weather."));
        autoParts.add(new AutoPart("15", "Sport exhaust system", "Auto136", "A15", "New", 5, 300, "Enhances engine sound and performance."));
        autoParts.add(new AutoPart("16", "Front bumper guard", "Auto136", "A16", "New", 30, 150, "Protects front bumper from damage."));
        autoParts.add(new AutoPart("17", "Heated seats", "Auto136", "A17", "New", 8, 350, "Provides warmth during cold weather."));
        autoParts.add(new AutoPart("18", "Windshield wipers", "Auto136", "A18", "New", 40, 25, "Keeps windshield clear of rain."));
        autoParts.add(new AutoPart("19", "Custom floor mats", "Auto136", "A19", "New", 15, 45, "Custom-fit floor mats for interior protection."));
        autoParts.add(new AutoPart("20", "Sunroof", "Auto136", "A20", "New", 7, 600, "Provides an open-air experience."));
        autoParts.add(new AutoPart("21", "Performance air filter", "Auto136", "A21", "New", 22, 70, "Improves engine airflow."));
        autoParts.add(new AutoPart("22", "Roof box", "Auto136", "A22", "New", 9, 320, "Additional storage space on the roof."));
        autoParts.add(new AutoPart("23", "Backup sensors", "Auto136", "A23", "New", 12, 200, "Alerts you to obstacles while reversing."));
        autoParts.add(new AutoPart("24", "Front fog lights", "Auto136", "A24", "New", 14, 130, "Improves visibility in foggy conditions."));
        autoParts.add(new AutoPart("25", "Portable jump starter", "Auto136", "A25", "New", 20, 70, "Jump-starts a dead battery without another car."));
        autoParts.add(new AutoPart("26", "Engine cover", "Auto136", "A26", "New", 16, 110, "Protects and enhances engine appearance."));
        autoParts.add(new AutoPart("27", "Alloy wheels", "Auto136", "A27", "New", 6, 800, "Stylish and lightweight wheels."));
        autoParts.add(new AutoPart("28", "Side mirror covers", "Auto136", "A28", "New", 25, 45, "Protects and styles side mirrors."));
        autoParts.add(new AutoPart("29", "High-intensity discharge (HID) bulbs", "Auto136", "A29", "New", 30, 180, "Provides brighter and more efficient lighting."));
        autoParts.add(new AutoPart("30", "Anti-theft alarm system", "Auto136", "A30", "New", 11, 250, "Provides security against theft."));
    }
    public void makeSampleTransactions() {
        List<AutoPart> parts1 = new ArrayList<>();
        parts1.add(new AutoPart("01", "Roof box", "Auto136", "A01", "New", 24, 40, "Additional storage space on the roof."));
        List<AutoPart> parts2 = new ArrayList<>();
        parts2.add(new AutoPart("02", "Side mirror covers", "Auto136", "A02", "New", 13, 20.32, "Protects and styles side mirrors."));
        List<AutoPart> parts3 = new ArrayList<>();
        parts3.add(new AutoPart("03", "Anti-theft alarm system", "Auto136", "A02", "New", 13, 20.32, "Provides security against theft."));
        List<AutoPart> parts4 = new ArrayList<>();
        parts4.add(new AutoPart("04", "Sunroof", "Auto136", "A02", "New", 13, 20.32, "Provides an open-air experience."));
        List<AutoPart> parts5 = new ArrayList<>();
        parts5.add(new AutoPart("05", "Tinted windows", "Auto136", "A02", "New", 13, 20.32, "Reduces heat and glare."));
        transactions.add(new Transaction("T-001", new Date(), "C-001", "S-001", parts1, 10, 35, "Discount applied"));
        transactions.add(new Transaction("T-002", new Date(), "C-002", "S-002", parts2, 5, 57, "Promotional discount"));
        transactions.add(new Transaction("T-003", new Date(), "C-003", "S-003", parts3, 0, 40, "No discount"));
        transactions.add(new Transaction("T-004", new Date(), "C-004", "S-004", parts4, 15, 50, "Seasonal discount"));
        transactions.add(new Transaction("T-005", new Date(), "C-005", "S-005", parts5, 20, 32, "Bulk purchase discount"));
    }
    public void serviceSamples() {
        List<AutoPart> replacedParts1 = new ArrayList<>();
        replacedParts1.add(autoParts.get(0));
        serviceHistories.add(new ServiceHistory("S-2", new Date(), "C-2", "M-2", "Tire Replacement", replacedParts1, 100, "Replaced all four tires"));

        List<AutoPart> replacedParts2 = new ArrayList<>();
        replacedParts2.add(autoParts.get(1));
        serviceHistories.add(new ServiceHistory("S-3", new Date(), "C-3", "M-3", "Interior Upgrade", replacedParts2, 150, "Upgraded interior with luxury materials"));

        List<AutoPart> replacedParts3 = new ArrayList<>();
        replacedParts3.add(autoParts.get(2));
        serviceHistories.add(new ServiceHistory("S-4", new Date(), "C-4", "M-4", "Oil Filter Replacement", replacedParts3, 40, "Replaced the engine oil filter"));

        List<AutoPart> replacedParts4 = new ArrayList<>();
        replacedParts4.add(autoParts.get(3));
        serviceHistories.add(new ServiceHistory("S-5", new Date(), "C-5", "M-5", "LED Headlight Installation", replacedParts4, 200, "Installed new LED headlights"));

        List<AutoPart> replacedParts5 = new ArrayList<>();
        replacedParts5.add(autoParts.get(4));
        serviceHistories.add(new ServiceHistory("S-6", new Date(), "C-6", "M-6", "Navigation System Installation", replacedParts5, 800, "Installed a new navigation system"));

        List<AutoPart> replacedParts6 = new ArrayList<>();
        replacedParts6.add(autoParts.get(5));
        serviceHistories.add(new ServiceHistory("S-7", new Date(), "C-7", "M-7", "Battery Replacement", replacedParts6, 60, "Replaced the car battery"));

        List<AutoPart> replacedParts7 = new ArrayList<>();
        replacedParts7.add(autoParts.get(6));
        serviceHistories.add(new ServiceHistory("S-8", new Date(), "C-8", "M-8", "Rearview Mirror Installation", replacedParts7, 100, "Installed new rearview mirror"));

        List<AutoPart> replacedParts8 = new ArrayList<>();
        replacedParts8.add(autoParts.get(7));
        serviceHistories.add(new ServiceHistory("S-9", new Date(), "C-9", "M-9", "Engine Mount Replacement", replacedParts8, 150, "Replaced the engine mounts"));

        List<AutoPart> replacedParts9 = new ArrayList<>();
        replacedParts9.add(autoParts.get(8));
        serviceHistories.add(new ServiceHistory("S-10", new Date(), "C-10", "M-10", "Floor Mats Replacement", replacedParts9, 45, "Replaced old floor mats"));

        List<AutoPart> replacedParts10 = new ArrayList<>();
        replacedParts10.add(autoParts.get(9));
        serviceHistories.add(new ServiceHistory("S-11", new Date(), "C-11", "M-11", "Audio System Installation", replacedParts10, 350, "Installed a premium audio system"));

        List<AutoPart> replacedParts11 = new ArrayList<>();
        replacedParts11.add(autoParts.get(10));
        serviceHistories.add(new ServiceHistory("S-12", new Date(), "C-12", "M-12", "Air Filter Replacement", replacedParts11, 30, "Replaced the cabin air filter"));

        List<AutoPart> replacedParts12 = new ArrayList<>();
        replacedParts12.add(autoParts.get(11));
        serviceHistories.add(new ServiceHistory("S-13", new Date(), "C-13", "M-13", "Performance Exhaust System Installation", replacedParts12, 300, "Installed a high-performance exhaust system"));

        List<AutoPart> replacedParts13 = new ArrayList<>();
        replacedParts13.add(autoParts.get(12));
        serviceHistories.add(new ServiceHistory("S-14", new Date(), "C-14", "M-14", "New Side Mirrors Installation", replacedParts13, 120, "Replaced old side mirrors with new ones"));

        List<AutoPart> replacedParts14 = new ArrayList<>();
        replacedParts14.add(autoParts.get(13));
        serviceHistories.add(new ServiceHistory("S-15", new Date(), "C-15", "M-15", "Brake System Upgrade", replacedParts14, 180, "Upgraded the brake system for better performance"));

        List<AutoPart> replacedParts15 = new ArrayList<>();
        replacedParts15.add(autoParts.get(14));
        serviceHistories.add(new ServiceHistory("S-16", new Date(), "C-16", "M-16", "Radiator Replacement", replacedParts15, 250, "Replaced the old radiator with a new one"));

        List<AutoPart> replacedParts16 = new ArrayList<>();
        replacedParts16.add(autoParts.get(15));
        serviceHistories.add(new ServiceHistory("S-17", new Date(), "C-17", "M-17", "Fog Light Installation", replacedParts16, 130, "Installed new fog lights for better visibility"));

        List<AutoPart> replacedParts17 = new ArrayList<>();
        replacedParts17.add(autoParts.get(16));
        serviceHistories.add(new ServiceHistory("S-18", new Date(), "C-18", "M-18", "Air Conditioning System Upgrade", replacedParts17, 500, "Upgraded the air conditioning system"));

        List<AutoPart> replacedParts18 = new ArrayList<>();
        replacedParts18.add(autoParts.get(17));
        serviceHistories.add(new ServiceHistory("S-19", new Date(), "C-19", "M-19", "Climate Control Unit Replacement", replacedParts18, 220, "Replaced the climate control unit"));

        List<AutoPart> replacedParts19 = new ArrayList<>();
        replacedParts19.add(autoParts.get(18));
        serviceHistories.add(new ServiceHistory("S-20", new Date(), "C-20", "M-20", "Steering Wheel Cover Installation", replacedParts19, 50, "Installed a new steering wheel cover"));

        List<AutoPart> replacedParts20 = new ArrayList<>();
        replacedParts20.add(autoParts.get(19));

    }
    public void carSamples() {
        List<ServiceHistory2> histories1 = new ArrayList<>();
        histories1.add(new ServiceHistory2("1-1-2024", "Routine maintenance"));
        List<ServiceHistory2> histories2 = new ArrayList<>();
        histories2.add(new ServiceHistory2("2-1-2024", "Wheel alignment"));
        List<ServiceHistory2> histories3 = new ArrayList<>();
        histories3.add(new ServiceHistory2("3-1-2024", "Battery replacement"));
        cars.add(new Car("C01", "Toyota", "Camry", 2021, 12000, "Yellow", "Available", 25000, "No issues.", histories1));
        cars.add(new Car("C02", "Honda", "Civic", 2020, 19000, "Grey", "Available", 22000, "No issues.",histories2));
        cars.add(new Car("C03", "Ford", "Mustang", 2022, 5000, "Red", "Available", 35000, "Wheel got crashed.", histories3));
        cars.add(new Car("C04", "Chevrolet", "Malibu", 2019, 24000, "Blue", "Sold", 21000, "Minor scratches.", histories1));
        cars.add(new Car("C05", "Nissan", "Altima", 2018, 35000, "Gray", "Available", 19000, "In good condition.", histories2));
        cars.add(new Car("C06", "Hyundai", "Sonata", 2021, 10000, "Silver", "Available", 24000, "No issues.", histories3));
        cars.add(new Car("C07", "Kia", "Optima", 2020, 25000, "White", "Available", 23000, "Repair the exhausted system.", histories1));
        cars.add(new Car("C08", "Mazda", "6", 2019, 35000, "Black", "Sold", 22000, "Good condition.", histories2));
        cars.add(new Car("C09", "Subaru", "Legacy", 2021, 8000, "Red", "Available", 26000, "No issues.", histories3));
        cars.add(new Car("C10", "Volkswagen", "Passat", 2022, 3000, "Blue", "Available", 27000, "No issues.", histories1));
        cars.add(new Car("C11", "BMW", "3 Series", 2020, 15000, "Gray", "Available", 15000, "Engine has problem.", histories2));
        cars.add(new Car("C12", "Mercedes-Benz", "C-Class", 2019, 25000, "Silver", "Sold", 32000, "Minor wear and tear.", histories3));
        cars.add(new Car("C13", "Audi", "A4", 2021, 12000, "Brown", "Available", 34000, "No issues.", histories1));
        cars.add(new Car("C14", "Lexus", "ES", 2020, 18000, "White", "Available", 33000, "Good condition.",histories2));
        cars.add(new Car("C15", "Porsche", "Macan", 2022, 5000, "Red", "Available", 50000, "No issues.",histories3));
        cars.add(new Car("C16", "Jaguar", "XF", 2019, 22000, "Blue", "Available", 34000, "Minor scratches.",histories1));
        cars.add(new Car("C17", "Land Rover", "Range Rover", 2020, 25000, "Gray", "Available", 60000, "In good condition.",histories2));
        cars.add(new Car("C18", "Cadillac", "XT5", 2021, 13000, "Silver", "Available", 43000, "No issues.",histories3));
        cars.add(new Car("C19", "Buick", "Enclave", 2019, 30000, "Gold", "Sold", 35000, "Good condition.",histories1));
        cars.add(new Car("C20", "Chrysler", "Pacifica", 2020, 18000, "White", "Available", 32000, "No issues.",histories2));

    }


    public User login(String username, String password) {
        if (users.containsKey(username) && username.equals(password)) {
            return users.get(username);
        } else {
            System.out.println("Invalid username or password");
            return null;
        }
    }

    public void printUserDetails(User user) {
        if (user != null) {
            System.out.println("UserID: " + user.getUserID());
            System.out.println("Full Name: " + user.getFullName());
            System.out.println("Email: " + user.getEmail());
            System.out.println("User Type: " + user.getUserType());

            if (user instanceof Employee) {
                Employee employee = (Employee) user;
                System.out.println("Hire Date: " + employee.getHireDate());
                System.out.println("Salary: " + employee.getSalary());
            }

            if (user instanceof Manager) {
                Manager manager = (Manager) user;
                System.out.println("Department: " + manager.getDepartment());
            }

            if (user instanceof SalesPerson) {
                SalesPerson salesPerson = (SalesPerson) user;
                System.out.println("Transaction history: ");
                printTransactionHistory(salesPerson);
            }
        } else {
            System.out.println("Nothing to display");
        }
    }

    public void printTransactionHistory(SalesPerson salesPerson) {
        List<Transaction> transactions = salesPerson.viewSaleHistory();
        System.out.println("Sales History:" + salesPerson.viewSaleHistory());
        for (Transaction transaction : transactions) {
            System.out.println(transaction.getTransactionDetails());
        }
    }

    public void updateTransaction(String transactionID, String clientID, List<Object> purchasedItems, double discount, double totalAmount, String notes) {
        List<Transaction> transactions = findTransactionsByID(transactionID);
        for (Transaction transaction : transactions) {
            transaction.updateTransactionDetails(clientID, purchasedItems, discount, totalAmount, notes);
        }
    }

    private List<Transaction> findTransactionsByID(String transactionID) {
        return new ArrayList<>();
    }

    private static void showWelcomeScreen() {
        JFrame frame = new JFrame("Welcome Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));

        panel.add(new JLabel("COSC2081 GROUP ASSIGNMENT", JLabel.CENTER));
        panel.add(new JLabel("AUTO168 CAR DEALERSHIP MANAGEMENT SYSTEM", JLabel.CENTER));
        panel.add(new JLabel("Instructor: Mr. Minh Vu & Mr. Dung Nguyen", JLabel.CENTER));
        panel.add(new JLabel("Group: THLT", JLabel.CENTER));
        panel.add(new JLabel("s3932811, Tran Vu Thinh", JLabel.CENTER));
        panel.add(new JLabel("s3979446, Bui Quoc Huy", JLabel.CENTER));
        panel.add(new JLabel("s3986441, Vu Nguyen Phuc Lam", JLabel.CENTER));
        panel.add(new JLabel("s3980087, Dang Minh Tam", JLabel.CENTER));

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void showMenu(User user) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMAIN MENU");
            if (user instanceof Manager) {
                System.out.println("1. Assign Task to Employee");
                System.out.println("2. View Reports");
                System.out.println("3. Approve Transaction");
            } else if (user instanceof SalesPerson) {
                System.out.println("1. Update Transaction");
                System.out.println("2. Manage Auto Parts");
                System.out.println("3. View Sale History");
            } else if (user instanceof Mechanic) {
                System.out.println("1. Perform Service");
                System.out.println("2. Update Service Status");
                System.out.println("3. View Assigned Services");
            }
            System.out.println("0. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (user instanceof Manager) {
                        System.out.println("Enter employee ID and task:");
                        System.out.println("Enter employee ID:");
                        String employeeID = scanner.nextLine().trim();
                        users.put("E-01", new Employee("E-01", "Huy", new Date(), "123 Street", "1292310934", "huyvt@gmail.com", "Employee", new Date(), 800));
                        users.put("E-02", new Employee("E-02", "Lam", new Date(), "456 Street", "0986234509", "lamsg@gmail.com", "Employee", new Date(), 800));


                        System.out.println("Enter task description:");
                        String description = scanner.nextLine().trim();

                        System.out.println("Available employee IDs: " + users.keySet());
                        System.out.println("Input employee ID: " + employeeID);
                        Manager manager = (Manager) user;
                        Employee employee = (Employee) users.get(employeeID);

                        if (employee != null) {
                            if (!description.isEmpty()) {
                                Task task = new Task(employee, description);
                                manager.assignTask(employee, String.valueOf(task));
                                System.out.println("Task assigned successfully.");
                            }
                            else if (!description.isEmpty()) {
                                System.out.println("Task description cannot be empty.");
                            } else {
                                System.out.println("Invalid employee ID.");
                            }
                        }
                    } else {
                        System.out.println("You do not have permission to assign tasks.");
                    }  if (user instanceof SalesPerson) {
                        System.out.println("Enter transaction ID to update:");
                        String transactionID = scanner.nextLine();
                        System.out.println("Enter new client ID:");
                        String clientID = scanner.nextLine();
                        System.out.println("Enter new discount:");
                        double discount = scanner.nextDouble();
                        System.out.println("Enter new total amount:");
                        double totalAmount = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Enter new notes:");
                        String notes = scanner.nextLine();
                        List<Object> purchasedItems = getPurchasedItemsFromUser(scanner);
                        updateTransaction(transactionID, clientID, purchasedItems, discount, totalAmount, notes);
                    } else if (user instanceof Mechanic) {
                        System.out.println("Enter service ID to perform:");
                        String serviceID = scanner.nextLine();
                    }
                    break;

                case 2:
                    if (user instanceof Manager) {
                        Manager manager = (Manager) user;
                        manager.viewReports();
                    } else if (user instanceof SalesPerson) {
                        SalesPerson salesPerson = (SalesPerson) user;
                        printTransactionHistory(salesPerson);
                    } else if (user instanceof Mechanic) {
                        Mechanic mechanic = (Mechanic) user;
                        mechanic.displayAssignedServices();
                    }
                    break;

                case 3:
                    if (user instanceof Manager) {
                        System.out.println("Enter transaction ID to approve:");
                        String transactionID = scanner.nextLine();
                        Transaction transaction = findTransactionByID(transactionID);
                        Manager manager = (Manager) user;
                        manager.approveTransaction(transaction);
                    } else if (user instanceof SalesPerson) {
                        System.out.println("Manage auto parts functionality not yet implemented.");
                    } else if (user instanceof Mechanic) {
                        System.out.println("Enter service ID and status to update:");
                        String serviceID = scanner.nextLine();
                        String status = scanner.nextLine();
                        Mechanic mechanic = (Mechanic) user;
                        mechanic.updateServiceStatus(new ServiceHistory(serviceID, new Date(), "", "", "", new ArrayList<>(), 0, ""), status);
                    }
                    break;

                case 0:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private Transaction findTransactionByID(String transactionID) {
        // Dummy implementation for finding a transaction by ID
        return new Transaction(transactionID, new Date(), "", "", new ArrayList<>(), 0, 0, "");
    }

    private static List<Object> getPurchasedItemsFromUser(Scanner scanner) {
        // Dummy implementation for gathering purchased items from user input
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        showWelcomeScreen();
        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        User loggedIn = main.login(username, password);
        if (loggedIn != null) {
            main.printUserDetails(loggedIn);
            main.showMenu(loggedIn);
        }

    }
}
