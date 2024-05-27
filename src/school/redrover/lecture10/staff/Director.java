package school.redrover.lecture10.staff;

public class Director extends Manager {
//    public Director(String name, int numberOfSubordinates) {
//        super(name, numberOfSubordinates);
//    }


    @Override
    protected int getValue() {
        return 9;
    }

    @Override
    public double getSalary() {
        if (super.getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            return super.getBaseSalary() + (super.getNumberOfSubordinates() / 100.0 * getValue());
        }
    }
}


