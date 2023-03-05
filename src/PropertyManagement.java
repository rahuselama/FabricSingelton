import java.util.ArrayList;
import java.util.Scanner;

public class PropertyManagement //implements IPropertyList {
   // @Override
{
    public Property createProperty() {
        // ArrayList<Property> newListOfProperties1 = new ArrayList<>();

        System.out.println("Please choose type of property you would like to set:APPARTMENT, CONDO, HOUSE");
        Scanner scanner = new Scanner(System.in);
        Property theProperty = null;
        if (scanner.hasNextLine()) {
            String model = scanner.nextLine().trim().toUpperCase();
            theProperty = PropertyFactory.getInstance().buildProperty(PropertyType.valueOf(model));
        } else System.out.println("Please choose type of property you would like to see");
        //newListOfProperties1.add(theProperty);
         System.out.println("new Properties: \n" +theProperty);
        //  System.out.println("Size is: "+newListOfProperties1.size());

        Main.newListOfProperties.add(theProperty);
        System.out.println("Size is: "+ Main.newListOfProperties.size());
        System.out.println("List "+ Main.newListOfProperties);

        return theProperty;
    }


}






