/**
 * @author Xiaoyu Cheng
 * @student_ID 40254110
 * @description
 */

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author Xiaoyu Cheng
 * @student_ID 40254110
 * @description
 */

class AdminView {

    private RMSController controller;
    private Scanner scanner;
//    private List<Integer> properties; will need this in the future

    public AdminView() {
        scanner = new Scanner(System.in);
        RentalManagementSystem system= new RentalManagementSystem();
        this.controller = new RMSController(system, this);

    }

    public void displayMenu() {
        while(true) {
            System.out.println("\n==== Main Menu ====");
            System.out.println("1. Add a property");
            System.out.println("2. Add a tenant");
            System.out.println("3. Rent a unit");
            System.out.println("4. Display properties");
            System.out.println("5. Display tenants");
            System.out.println("6. Display rented units");
            System.out.println("7. Display vacant units");
            System.out.println("8. Display all leases");
            System.out.println("9. Pay Rent");
            System.out.println("10. End Lease for a property");
            System.out.println("11. Check the rent payment status");
            System.out.println("12. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1 -> addProperty();
                case 2 -> addTenant();
                case 3 -> rentUnit();
                case 4 -> displayAllProperties();
                case 5 -> displayAllTenants();
                case 6 -> displayRentedUnits();
                case 7 -> displayVacantUnits();
                case 8 -> displayAllLeases();
                case 9 -> payRent();
                case 10 -> endLease();
                case 11 -> checkPayment();
                case 12 -> System.exit(0);
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    public void addProperty() {

        System.out.println("\n==== Add Property ====");
        System.out.println("Enter the propertyID");
        int propertyID = scanner.nextInt();
        System.out.println("Enter the street address: ");
        String address = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the area of the property: ");
        double area = scanner.nextDouble();
        System.out.println("Enter the zipCode of the property (5 digits int): ");
        int zip = scanner.nextInt();
        System.out.println("Enter the number of bedrooms");
        int nbrBed = scanner.nextInt();
        System.out.println("Enter the number of bathrooms");
        int nbrBath = scanner.nextInt();
        System.out.println("Enter the propertyType: 1 is house, 2 is apartment, 3 is condo");
        int type = scanner.nextInt();


        PropertyFactory pF = new PropertyFactory();
        Property property = pF.createProperty(type);
        if (property instanceof Condo) {
           System.out.println("Enter the unit of Condo:");
           int unitNumber = scanner.nextInt();
           ((Condo) property).setUnitNumber(unitNumber);
        } else if (property instanceof Apartment) {
            System.out.println("Enter the unit of Apartment:");
            int unitNumber = scanner.nextInt();
            ((Apartment) property).setUnitNumber(unitNumber);
        }

        property.setPropertyID(propertyID);
        property.setAddress(address);
        property.setArea(area);
        property.setZip(zip);
        property.setNbrBed(nbrBed);
        property.setNbrBath(nbrBath);
        property.setType(type);




        controller.addProperty(property);
        System.out.println("Property is added!");
    }

    public void addTenant() {

        System.out.println("\n==== Add Tenant ====");
        System.out.println("Enter tenant ID");
        int ID = scanner.nextInt();
        System.out.println("Enter the first name");
        String firstName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter the last name");
        String lastName = scanner.nextLine();
        System.out.println("Enter phone number (10 digits integer)");
        String phoneNbr = scanner.nextLine();
        System.out.println("Enter the email address");
        String email = scanner.nextLine();
        System.out.println("Enter the SIN number (9 digits integer)");
        String SIN = scanner.nextLine();

        Tenant tenant = new Tenant();
        tenant.setID(ID);
        tenant.setFirstName(firstName);
        tenant.setLastName(lastName);
        tenant.setPhoneNbr(phoneNbr);
        tenant.setEmail(email);
        tenant.setSIN(SIN);

        controller.addTenant(tenant);
    }

    public void rentUnit() {
        System.out.println("\n==== Rent a Unit ====");
        System.out.println("Enter the ID of the property you want to rent to check its availability: ");
        int propertyIDWanted = scanner.nextInt();
        if (controller.checkAvailability(propertyIDWanted)) {
            System.out.println("please input tenant ID");
            int tenantID = scanner.nextInt();
            Tenant tenant = controller.getATenant(tenantID);
            Property property = controller.getAProperty(propertyIDWanted);
            //create a lease object
            System.out.println("Enter lease ID");
            int leaseID = scanner.nextInt();

            System.out.println("Enter the lease start date (yyyy-mm-dd): ");
            String startDateString = scanner.nextLine();

            while (startDateString.isEmpty()) {
                System.out.println("Please enter a valid start date (yyyy-mm-dd): ");
                startDateString = scanner.nextLine();
            }


            System.out.println("Enter the lease end date (yyyy-mm-dd): ");
            String endDateString = scanner.nextLine();
            while (endDateString.isEmpty()) {
                System.out.println("Please enter a valid end date (yyyy-mm-dd): ");
                startDateString = scanner.nextLine();
            }

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate startDate = LocalDate.parse(startDateString, formatter);
            LocalDate endDate = LocalDate.parse(endDateString, formatter);

            System.out.println("Enter the lease amount ");
            double leaseAmount = scanner.nextDouble();

            Lease lease = new Lease(leaseID, tenant, property, startDate, endDate, leaseAmount);
            controller.addLease(lease);
            controller.createRentalUnit(property, tenant, lease);

        } else {
            System.out.println("property occupied, do you want to be on the watching list");
            // Saeed's code for the implementation

        }

        System.out.println("Lease added");




    }

    public void displayAllProperties() {
        for (int i = 0; i < controller.getAllProperties().size(); i++) {
            System.out.println(controller.getAllProperties().get(i));
        }
    }

    public void displayAllTenants() {
        for (int i = 0; i < controller.getAllTenants().size(); i++) {
            System.out.println(controller.getAllTenants().get(i));
        }

    }

    public void displayRentedUnits() {
        for (int i = 0; i < controller.getRentedProperties().size(); i++) {
            System.out.println(controller.getRentedProperties().get(i));
        }
    }

    public void displayVacantUnits() {
        for (int i = 0; i < controller.getVacantProperties().size(); i++) {
            System.out.println(controller.getVacantProperties().get(i));
        }

    }

    public void displayAllLeases() {
        for (int i = 0; i < controller.getAllLeases().size(); i++) {
            System.out.println(controller.getAllLeases().get(i));
        }

    }


    public void payRent() {
        System.out.println("\n==== Pay Rent ====");
        System.out.print("Enter the tenant ID: ");

        int tenantID = scanner.nextInt();

        Tenant tenant = controller.getATenant(tenantID);
        if (tenant == null) {
            System.out.println("Tenant Not Found");
            return;
        }
        RentalUnit rU = controller.getRentalUnitWithTenant(tenant);

        if (rU == null) {
            System.out.println("No rental unit / lease found with this tenant");
            return;
        }
        controller.addPaymentRecord(rU);

        System.out.println("Rent payment was made!");


    }

    public void endLease() {
        System.out.println("Terminate Lease for which property? Enter ID please");
        int propertyID = scanner.nextInt();
        RentalUnit rU = controller.getRentUnitWithPropertyID(propertyID);
        controller.endLease(rU);
    }

    public void checkPayment() {
        System.out.println("Check a lease payment status for a property by entering its ID");
        int propertyID = scanner.nextInt();
        RentalUnit rU = controller.getRentUnitWithPropertyID(propertyID);

        if (controller.checkRentPaid(rU)) {
            System.out.println("Rent paid for this unit!");
        } else {
            System.out.println("Payment was not made");
        }

    }




}
