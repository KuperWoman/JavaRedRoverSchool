package school.redrover.lecture11.HW_11.employee;

public final class Director extends Employee{


    private int numberOfSubordinates;
    private final int valueDirector;

    public Director(int valueDirector) {
        this.valueDirector = valueDirector;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public int valueDirector() {
        return valueDirector;
    }


    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return super.getBaseSalary();
        } else {
            return super.getBaseSalary() + (getNumberOfSubordinates() / 100.0 * valueDirector);
        }
    }


}
