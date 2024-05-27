package school.redrover.lecture11.HW_11.month;

public final class Manager extends BaseEmployee {

    private int numberOfSubordinates;

    public Manager(String name, double dailySalary, int numberOfSubordinates) {
        super(name, dailySalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double sum = 0;
        for (int i = 0; i < monthArray.length; i++) {
            sum += monthArray[i].getNumberOfWorkingDays() * getDailySalary();
        }
        return sum * (1 + 0.01 * numberOfSubordinates);
    }
}
