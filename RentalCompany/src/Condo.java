import java.util.Scanner;

/**
 * @author Xiaoyu Cheng
 * @student_ID 40254110
 * @description
 */
class Condo extends Property{
    protected int unitNumber;
    private Scanner scanner;

    public Condo() {
        this.unitNumber = 0;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }


}
