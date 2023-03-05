import java.util.HashMap;
import java.util.Map;

public class Accounting {

    // maps each rental unit to a boolean value indicating the status of rent payment
    private Map<RentalUnit, Boolean> paymentRecords;

    public Accounting() {
        this.paymentRecords = new HashMap<>();
    }

    //autogenerated getter and setter I dont know how to use hashmap properly, but lets keep them first
    public Map<RentalUnit, Boolean> getPaymentRecords() {
        return paymentRecords;
    }

    public void setPaymentRecords(Map<RentalUnit, Boolean> paymentRecords) {
        this.paymentRecords = paymentRecords;
    }

    // add a payment record to the map:
    public void addPaymentRecord(RentalUnit rentalUnit, boolean isPaid) {
        paymentRecords.put(rentalUnit, isPaid);
    }

    // check if a rent is paid for the unit (using the unit as index)
    public boolean isPaid(RentalUnit rentalUnit) {
        return paymentRecords.getOrDefault(rentalUnit, false);
    }
}
