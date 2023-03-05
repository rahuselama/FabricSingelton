import java.util.ArrayList;

public class Subscriber extends Person
        implements IObserver{

    private boolean hasSubscription = true;
    public Subscriber(String name, String lastName, int personID, String email) {
        super(name, lastName, personID, email);
    }

    @Override
    public void handleEvent(ArrayList<Property> availableForRent) {
System.out.println("Dear" + getName()+ "\n we have new available properties \n" + availableForRent );
    }
}
