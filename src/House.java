public class House extends Property{


        House() {
            super(PropertyType.HOUSE);
            construct();
        }

        @Override
        protected void construct() {
            System.out.println("Building House");
            // add accessories
        }
    }



