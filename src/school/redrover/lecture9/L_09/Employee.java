package school.redrover.lecture9.L_09;

public class Employee {
    public String name;
    public boolean fired;
    public int salary;

    public boolean isSameName(Employee otherEmployee){
        return this.name.equals(otherEmployee.name);
    }

    public boolean isFired() {
        return fired;
    }
}
