/**
 * @author Xiaoyu Cheng
 * @student_ID 40254110
 * @description
 */

/*
The system manages all the data structure, part of the model
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RentalManagementSystem {
    private List<Property> properties;
    private List<Tenant> tenants;
    private List<Lease> leases;

    private List<RentalUnit> rentalUnits;
    private Accounting accounting;

    public RentalManagementSystem() {
        this.properties = new ArrayList<>();
        this.tenants = new ArrayList<>();
        this.leases = new ArrayList<>();
        this.accounting = new Accounting();
        this.rentalUnits = new ArrayList<>();
    }

    // Getters and setters for properties, tenants, leases, and accounting
    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public List<Tenant> getTenants() {
        return tenants;
    }

    public void setTenants(List<Tenant> tenants) {
        this.tenants = tenants;
    }

    public List<Lease> getLeases() {
        return leases;
    }

    public void setLeases(List<Lease> leases) {
        this.leases = leases;
    }

    public Accounting getAccounting() {
        return accounting;
    }

    public void setAccounting(Accounting accounting) {
        this.accounting = accounting;
    }


    // Method to add/remove a new property to the system
    public void addProperty(Property property) {
        properties.add(property);
    }

    public void removeProperty(Property property) {
        properties.remove(property);
    }

    // Method to add/remove a new tenant to the system
    public void addTenant(Tenant tenant) {
        tenants.add(tenant);
    }
    public void removeTenant(Tenant tenant) {
        tenants.remove(tenant);
    }

    // Method to add a new lease to the system
    public void addLease(Lease lease) {
        leases.add(lease);
    }
    public void removeLease(Lease lease) {
        leases.remove(lease);
    }


    public void addRentalUnit(RentalUnit rentalUnit) {
        rentalUnits.add(rentalUnit);
    }

    public List<RentalUnit> getRentalUnits() {
        return rentalUnits;
    }

    public void setRentalUnits(List<RentalUnit> rentalUnits) {
        this.rentalUnits = rentalUnits;
    }

    public void removeRentalUnit(RentalUnit rentalUnit) {
        rentalUnits.remove(rentalUnit);
    }
    // Return a list of all rented units
    public List<Integer> getRentedUnits() {
        List<Integer> rentedUnits = new ArrayList<>();
        for (Lease lease: leases) {
            rentedUnits.add(lease.getProperty().getPropertyID());
        }
        return rentedUnits;
    }

    // Return a list of all vacant units
    public List<Integer> getVacantUnits() {
        List<Integer> vacantUnit = new ArrayList<>();
        for (Property property: properties) {
            if (property.getRented() == 0) {
                vacantUnit.add(property.getPropertyID());
            }
        }
        return vacantUnit;
    }

    // Return a list of all properties (ID)
    public List<Integer> getAllProperties() {
        List<Integer> allProperties = new ArrayList<>();
        for (Property property: properties) {
            allProperties.add(property.getPropertyID());
        }
        return allProperties;
    }

    // Return a list of all tenants (first name + last name)
    public List<String> getAllTenants() {
        List<String> allTenants = new ArrayList<>();
        for (Tenant tenant: tenants) {
            allTenants.add(tenant.getID() +" "+ tenant.getFirstName() + " " + tenant.getLastName());
        }
        return allTenants;
    }

    // Return a list of all leases (ID + start-end date + amount)
    public List<String> getAllLeases() {
        List<String> allLeases = new ArrayList<>();
        for (Lease lease: leases) {
            allLeases.add(lease.getLeaseID() + "\nStarting from " + lease.getStartDate()
            + "\n Ends on " + lease.getEndDate() +
                    "\n Price "  + lease.getRentAmount());
        }
        return allLeases;
    }


}

