package school.redrover.lecture11.HW_11.employee;

import school.redrover.lecture11.HW_11.employee.Employee;

public final class Manager extends Employee {

    private int numberOfSubordinates;
    private final int valueManager;

    public Manager(int value) {
        this.valueManager = value;
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
            return super.getBaseSalary();
        } else {
            return super.getBaseSalary() + (numberOfSubordinates / 100.0 * valueManager);
        }
    }
}
