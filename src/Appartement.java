public class Appartement extends Property{

    protected int unitNumber;
    Appartement() {
            super(PropertyType.APPARTEMENT);
            construct();
        }

        @Override
        protected void construct() {
            System.out.println("Building Appartement");
            arrangeParts();
            unitNumber = DisplayMenu.promptUser("Enter unit number").nextInt();
            System.out.println(unitNumber +" "+ propertyId);
            // add accessories
        }
    }

