public class PropertyFactory {

        public static Property buildProperty (PropertyType model) {
            Property property = null;
            switch (model) {
                case APPARTEMENT:
                    property = new Appartement();
                    break;

                case CONDO:
                    property = new Condo();
                    break;

                case HOUSE:
                    property = new House();
                    break;

                default:
                    // throw some exception
                    break;
            }
            return property;
        }
    }

