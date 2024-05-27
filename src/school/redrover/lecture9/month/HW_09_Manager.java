package school.redrover.lecture9.month;

public class HW_09_Manager extends HW_09_Employee{
    private int numberOfSubordinates;

    public HW_09_Manager(String name, int age, String sex, double dailySalary, int numberOfSubordinates) {
        super(name, age, sex, dailySalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    double getSalaryM(Month[] monthArray) {
        double sum = 0;
        for (int i = 0; i < monthArray.length; i++) {
            sum += monthArray[i].getNumberOfWorkingDays() * getSalary();
        }
        return sum * (1 + 0.01 * numberOfSubordinates);
    }


}
