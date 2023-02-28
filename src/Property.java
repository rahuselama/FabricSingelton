public abstract class Property {
    protected int propertyId;
    private String propertyType;
    private int zip;
    private String streetName;
    private double listPrice;
    private int bedroomNumber;
    private int bathroomNumber;
    private double sqFootage;
    private boolean available=false;

    //setters
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }
    public void setBedroomNumber(int bedroomNumber) {
        this.bedroomNumber = bedroomNumber;
    }
    public void setBathroomNumber(int bathroomNumber) {
        this.bathroomNumber = bathroomNumber;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
//getters

    public int getPropertyId() {
        return propertyId;
    }
    public int getBathroomNumber() {
        return bathroomNumber;
    }
    public int getBedroomNumber() {return bedroomNumber; }
    public int getZip(){return zip;}
    public String getStreetName() {
        return streetName;
    }
    public double getListPrice() {
        return listPrice;

    }
    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public Property(PropertyType model) {
        this.model = model;

        //arrangeParts();
    }

    protected void arrangeParts() {
        propertyId = DisplayMenu.promptUser("Enter property ID").nextInt();
        // Do one time processing here
    }

    // Do subclass level processing in this method
    protected abstract void construct();

    private PropertyType model = null;

    public PropertyType getModel() {
        return model;
    }

    public void setModel(PropertyType model) {
        this.model = model;
    }

}