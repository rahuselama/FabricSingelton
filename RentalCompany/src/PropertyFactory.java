/**
 * @author Xiaoyu Cheng
 * @student_ID 40254110
 * @description
 */
class PropertyFactory {

    public Property createProperty(int type) {
        Property product = null;
        if (type == 3) {
            product = new Condo();
        } else if (type == 2) {
            product = new Apartment();
        } else if (type == 1) {
            product = new House();
        } else {
            System.out.println("Please input a valid option");
        }
        return product;
    }
}
