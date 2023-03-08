/**
 * @author Xiaoyu Cheng
 * @student_ID 40254110
 * @description
 */

import java.time.LocalDate;

class Lease {

    private int leaseID;
    private Tenant tenant;
    private Property property;
    private LocalDate startDate;
    private LocalDate endDate;
    private double rentAmount;



    public Lease(int leaseID, Tenant tenant, Property property, LocalDate startDate, LocalDate endDate, double rentAmount) {
        this.leaseID = leaseID;
        this.tenant = tenant;
        this.property = property;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentAmount = rentAmount;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public int getLeaseID() {
        return leaseID;
    }

    public void setLeaseID(int leaseID) {
        this.leaseID = leaseID;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }
}
