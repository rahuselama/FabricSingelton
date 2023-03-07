/**
 * @author Xiaoyu Cheng
 * @student_ID 40254110
 * @description
 */
class Tenant extends Person implements Observer{
    private int propertyLeasing;

    public Tenant() {
    }

    @Override
    public void sendEmail() {
        System.out.println("Email sent to: " + this.getEmail());
    }
}
