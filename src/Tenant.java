import java.util.stream.StreamSupport;

public class Tenant extends Person{
    private boolean hasLease = true;

    public Tenant(String name, String lastName, int personID, String email) {
        super(name, lastName, personID, email);
    }


}
