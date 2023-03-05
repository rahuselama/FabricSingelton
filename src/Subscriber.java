import java.util.ArrayList;

public class Subscriber extends Person
        implements Observer{

    private boolean hasSubscription = true;
    public Subscriber(String name, String lastName, int personID, String email) {
        super(name, lastName, personID, email);
    }

    @Override
    public void sendEmail() {
        // how do we send a email here lol
        System.out.println("Email sent to: " + this.getEmail());
    }
}
