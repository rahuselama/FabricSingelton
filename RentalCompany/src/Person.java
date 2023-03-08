/**
 * @author Xiaoyu Cheng
 * @student_ID 40254110
 * @description
 */
abstract class Person {
    private int ID;
    private String firstName;

    private String lastName;

    private String phoneNbr;

    private String email;

    private String SIN;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Person() {
        this.ID = 0;
        this.firstName = "John";
        this.lastName = "Doe";
        this.phoneNbr = "0000000000";
        this.email = "default@default.com";
        this.SIN = "000000000";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSIN() {
        return SIN;
    }

    public void setSIN(String SIN) {
        this.SIN = SIN;
    }
}