public class PropertyFactory {
//Using Singelton Pattern to create only one object of property Factory
public static PropertyFactory instance;
public static PropertyFactory getInstance(){
    if(instance==null){
        instance = new PropertyFactory();
    } return instance;
}

private PropertyFactory(){}

        public Property buildProperty (PropertyType model) {
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

