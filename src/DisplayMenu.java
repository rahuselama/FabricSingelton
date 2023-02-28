import java.util.Scanner;

public class DisplayMenu {
    public static byte displayMenu() {

        byte menuOption;
        Scanner scanner = new Scanner(System.in);

        System.out.println(""
                + "\n Please decide what do you want to do today."
                + "\n/* -----------------------------------------------/"
                + "\n/* 1. Add a property                               */"
                + "\n/* 2. Add a tenant                                 */"
                + "\n/* 3. Rent a unit                                  */"
                + "\n/* 4. Display properties                           */"
                + "\n/* 5. Display tenants                              */"
                + "\n/* 6. Display rented units                         */"
                + "\n/* 7. Display vacant units                         */"
                + "\n/* 8. Display all leases                           */"
                + "\n/* 9. Display unpaid rent                         */"
                + "\n/* 10. Exit                                         */"
                + "\n/* -----------------------------------------------/");
        System.out.print("Input: ");
        menuOption = scanner.nextByte();

        return menuOption;
    }
    public static Scanner promptUser(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
}
