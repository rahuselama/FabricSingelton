import java.util.ArrayList;
import java.util.List;

public class RentalUnit implements Subject{
    private Property property;
    private Tenant tenant;
    private Lease lease;

    // status: 0 is not occupied, 1 is occupied
    private int status;

    private List<Observer> potentialTenants;

    public RentalUnit(Property property) {
        this.property = property;
        this.tenant = null;
        this.lease = null;
        this.status = 0;
        this.potentialTenants = new ArrayList<>();
    }

    // Getters and setters for attributes
    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
        this.status = 1;
    }

    public Lease getLease() {
        return lease;
    }

    public void endLease() {
        this.tenant = null;
        this.lease = null;
        status = 0;
        notifyPotentialTenant();
    }

    public void setLease(Lease lease) {
        this.lease = lease;
    }

    // Check if the rental unit is vacant
    public boolean isVacant() {
        return (status == 0);
    }

    @Override
    public void addPotentialTenant(Observer observer) {
        potentialTenants.add(observer);
    }

    @Override
    public void removePotentialTenant(Observer observer) {
        potentialTenants.remove(observer);
    }

    @Override
    public void notifyPotentialTenant() {
        for (Observer potentialTenant: potentialTenants) {
            potentialTenant.sendEmail();
        }
    }


}
