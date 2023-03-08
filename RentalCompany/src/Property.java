import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiaoyu Cheng
 * @student_ID 40254110
 * @description
 */
  abstract class Property {
    private String address;
    private int type;
    private double area;

    // assuming the company is in the states so the zipcode is int
    private int zip;

    private int nbrBed;

    private int nbrBath;

    private int propertyID;
    private int rented;

    private List<Integer> tenants;

     //Constructor for a property
    public Property() {
        this.propertyID = 0;
        this.address = "default";
        this.area = 0.0;
        this.zip = 00000;
        this.nbrBed = 0;
        this.nbrBath = 0;
        this.rented = 0;
        tenants = new ArrayList<>();
    }


    // Getters and setters for attributes
    public String getAddress() {
        return address;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public int getRented() {
        return rented;
    }

    public void setRented(int rented) {
        this.rented = rented;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getNbrBed() {
        return nbrBed;
    }

    public void setNbrBed(int nbrBed) {
        this.nbrBed = nbrBed;
    }

    public int getNbrBath() {
        return nbrBath;
    }

    public void setNbrBath(int nbrBath) {
        this.nbrBath = nbrBath;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


}

