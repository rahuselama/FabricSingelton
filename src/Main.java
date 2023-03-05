import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Property> newListOfProperties=new ArrayList<>();

    public static void main(String[] args) {
       // PropertyFactory propertyFactory= new PropertyFactory();
       // Property theProperty= PropertyFactory.getInstance().buildProperty();
//        System.out.println("Please choose type of property you would like to set:APPARTEMENT, CONDO, HOUSE");
//        Scanner scanner = new Scanner(System.in);
//        if (scanner.hasNextLine()){
//            String model = scanner.nextLine().trim().toUpperCase();
//            Property theProperty=PropertyFactory.getInstance().buildProperty(PropertyType.valueOf(model));}
//        else System.out.println("Please choose type of property you would like to see");
//    }
        PropertyManagement pm=new PropertyManagement();


        byte menuOption;
        do{
            menuOption = DisplayMenu.displayMenu();
            switch (menuOption) {
                case 1:
                    pm.createProperty();
                    break;
                case 2:
                    AvailableForRent available=new AvailableForRent();

                    available.addAvailableProperty();
                    IObserver i= new Subscriber("name", "lastname",111, "email");
                    available.addObserver(i);
                    break;
//                case 3:
//                    pm.createList();
//                    break;
////                case 4:
//                    PayrollSystem.exitApplication();
//                    break;
//                default:
//                    System.out.println("Invalid option, please try again");
//                    break;
            }
        } while (menuOption != 2);
    }

}
