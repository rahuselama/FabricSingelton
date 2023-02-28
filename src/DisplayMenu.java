import java.util.Scanner;

public class DisplayMenu {
    public static Scanner promptUser(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
}
