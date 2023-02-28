import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // PropertyFactory propertyFactory= new PropertyFactory();
       // Property theProperty= PropertyFactory.getInstance().buildProperty();
        System.out.println("Please choose type of property you would like to set:APPARTEMENT, CONDO, HOUSE");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            String model = scanner.nextLine();
            Property theProperty=PropertyFactory.getInstance().buildProperty(PropertyType.valueOf(model));}
        else System.out.println("Please choose type of property you would like to see");
    }
}
