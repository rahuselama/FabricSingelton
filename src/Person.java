// Person class represents a person in the system. A Human being.
public abstract class Person {
    private String name;
    private String lastName;
    private int personID;
    private String email;

    public Person(String name, String lastName, int personID, String email) {
        this.name = name;
        this.lastName = lastName;
        this.personID = personID;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return name + " " + lastName;
    }

    public int getPersonID() {
        return personID;
    }


    public String getEmail() {
        return email;
    }
}
