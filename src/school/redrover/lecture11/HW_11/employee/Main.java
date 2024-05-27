package school.redrover.lecture11.HW_11.employee;

public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker();
        w1.setName("Robert");
        w1.setBaseSalary(100);
        System.out.println(w1.getName() + " " + w1.getSalary());

        Manager m1 = new Manager(3);
        m1.setName("Tim");
        m1.setNumberOfSubordinates(10);
        m1.setBaseSalary(100);
        System.out.println(m1.getName() + " " + m1.getSalary());

        Director d1 = new Director(9);
        d1.setName("Jack");
        d1.setBaseSalary(100);
        d1.setNumberOfSubordinates(50);
        System.out.println(d1.getName() + " " + d1.getSalary());

    }
}
