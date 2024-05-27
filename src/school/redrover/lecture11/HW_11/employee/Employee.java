package school.redrover.lecture11.HW_11.employee;

public abstract class Employee {

    private String name;
    private double baseSalary;
    private double salary;


    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract double getSalary();




}
