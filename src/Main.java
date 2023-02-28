import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PropertyFactory propertyFactory= new PropertyFactory();
        Property theProperty= null;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            String model = scanner.nextLine();
            theProperty=propertyFactory.buildProperty(PropertyType.valueOf(model));}
        else System.out.println("Please choose type of property you would like to see");
    }
}
