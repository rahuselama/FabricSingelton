
    public class Condo extends Property{


        Condo() {
            super(PropertyType.CONDO);
            construct();
        }

        @Override
        protected void construct() {
            System.out.println("Building condo");
            // add accessories
        }
    }



