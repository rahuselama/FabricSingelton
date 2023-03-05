public class Appartment extends Property{

    protected int unitNumber;
    Appartment() {
            super(PropertyType.APPARTMENT);
            construct();
        }

        @Override
        protected void construct() {
            System.out.println("Building Appartment");
            arrangeParts();
            unitNumber = DisplayMenu.promptUser("Enter unit number").nextInt();
            System.out.println(unitNumber +" "+ propertyId);

            // add accessories
       }
    }

