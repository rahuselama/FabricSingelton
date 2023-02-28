public abstract class Property {
    protected int propertyId;

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
    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }
}