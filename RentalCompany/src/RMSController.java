import java.util.List;

/**
 * @author Xiaoyu Cheng
 * @student_ID 40254110
 * @description
 */

class RMSController {
    private RentalManagementSystem system;
    private AdminView view;

    public RMSController(RentalManagementSystem system, AdminView view) {
        this.system = system;
        this.view = view;
    }

    public void addProperty(Property property) {
        system.addProperty(property);
    }

    public void addTenant(Tenant tenant) {
        system.addTenant(tenant);
    }

    public void addLease(Lease lease) {
        system.addLease(lease);
    }

    public void createRentalUnit(Property property, Tenant tenant, Lease lease) {
        RentalUnit rentalUnit = new RentalUnit(property);
        rentalUnit.setLease(lease);
        rentalUnit.setTenant(tenant);
        system.addRentalUnit(rentalUnit);
        property.setRented(1);
    }

    public void run() {
        view.displayMenu();
    }

    public List<Integer> getAllProperties() {
        return system.getAllProperties();
    }

    public List<Integer> getVacantProperties() {
        return system.getVacantUnits();
    }

    public List<Integer> getRentedProperties() {
        return system.getRentedUnits();
    }

    public List<String> getAllTenants() {
        return system.getAllTenants();
    }

    public List<String> getAllLeases(){
        return system.getAllLeases();
    }

    public Boolean checkAvailability(int propertyID) {
        boolean result = false;
        if (system.getVacantUnits().contains(propertyID)) {
            result = true;
        }
        return result;
    }

    public Tenant getATenant(int tenantID) {
        Tenant wantedTenant = null;
        for (Tenant tenant: system.getTenants()) {
            if (tenant.getID() == tenantID) {
                wantedTenant = tenant;
                break;
            }
        }
        return wantedTenant;
    }

    public Property getAProperty(int propertyID) {
        Property wantedProperty = null;
        for (Property property: system.getProperties()) {
            if(property.getPropertyID() == propertyID) {
                wantedProperty = property;
                break;
            }
        }
        return wantedProperty;
    }
}
