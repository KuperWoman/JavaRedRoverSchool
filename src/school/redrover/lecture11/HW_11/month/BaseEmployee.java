package school.redrover.lecture11.HW_11.month;

public abstract class BaseEmployee {

    private String name;
    private int age;
    private char sex;
    private double dailySalary;

    public BaseEmployee(String name, double dailySalary) {
        this.name = name;
        this.dailySalary = dailySalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public abstract double getSalary(Month[] monthArray);

}
