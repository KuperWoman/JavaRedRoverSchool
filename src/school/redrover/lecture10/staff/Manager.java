package school.redrover.lecture10.staff;

public class Manager extends Worker {

//    public Manager(String name, int numberOfSubordinates) {
//        super(name);
//        this.numberOfSubordinates = numberOfSubordinates;
//    }

    private int numberOfSubordinates;
    protected  int getValue(){
        return 3;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (numberOfSubordinates == 0) {
            return super.getSalary();
        } else {
            return super.getBaseSalary() + (numberOfSubordinates / 100.0 * getValue());
        }
    }

}
