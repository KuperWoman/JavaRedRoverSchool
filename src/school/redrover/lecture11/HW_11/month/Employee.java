package school.redrover.lecture11.HW_11.month;

public final class Employee extends BaseEmployee{

    public Employee(String name, double dailySalary) {
        super(name, dailySalary);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double sum = 0;
        for (int i = 0; i < monthArray.length; i++) {
            sum += monthArray[i].getNumberOfWorkingDays() * getDailySalary();
        }
        return sum;
    }
}
