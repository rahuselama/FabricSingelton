public class Main {
    public static void main(String[] args) {
        RentalManagementSystem system = new RentalManagementSystem();
        AdminView view = new AdminView();
        RMSController controller = new RMSController(system, view);

        controller.run();

    }
}