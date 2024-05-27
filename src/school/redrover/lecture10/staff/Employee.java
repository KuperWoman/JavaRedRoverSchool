package school.redrover.lecture10.staff;

public class Employee {

    private String name;
    private double baseSalary;
    private double salary;

//    public Employee(String name, double baseSalary, double salary) {
//        this.name = name;
//        this.baseSalary = baseSalary;
//        this.salary = salary;
//    }

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


    public double getSalary(){
        return salary;
    }





}
