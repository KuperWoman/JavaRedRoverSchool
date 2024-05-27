package school.redrover.lecture10.staff;

public class Main_HW {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setName("Ilan");
        e1.setBaseSalary(100);
        System.out.println(e1.getName() + " " + e1.getBaseSalary());

        Employee e2 = new Employee();
        e2.setName("Ilan");
        e2.setBaseSalary(200);
        System.out.println(e2.getName() + " " + e2.getBaseSalary());

        Worker w1 = new Worker();
        w1.setName("Robert");
        w1.setBaseSalary(100);
        System.out.println(w1.getName() + " " + w1.getSalary());

        Manager m1 = new Manager();
        m1.setName("Tim");
        m1.setNumberOfSubordinates(10);
        m1.setBaseSalary(100);
        System.out.println(m1.getName() + " " + m1.getNumberOfSubordinates() + " " + m1.getSalary());

        Manager m2 = new Manager();
        m2.setName("Tom");
        m2.setNumberOfSubordinates(20);
        m2.setBaseSalary(100);
        System.out.println(m2.getName() + " " + m2.getNumberOfSubordinates() + " " + m2.getSalary());

        Director d1 = new Director();
        d1.setName("Jack");
        d1.setBaseSalary(100);
        d1.setNumberOfSubordinates(50);
        System.out.println(d1.getName() + " " + d1.getNumberOfSubordinates() + " " + d1.getSalary());

        Employee[] arr = {e1, e2, w1, m1, m2, d1} ;

        System.out.println("=====================");

        Utils a = new Utils();
        System.out.println((a.employeeByName(arr, "Ilan").getBaseSalary()));
        System.out.println(a.employeeBySubname(arr, "ck").getName());
        System.out.println(a.sumOfSalary(arr));
        System.out.println(a.minOfSalary(arr));
        System.out.println(a.maxOfSalary(arr));

        Manager[] arrm = {m1, m2};
        System.out.println(a.minOfSubordinates(arrm));
        System.out.println(a.minOfSubordinates(arr));
        System.out.println(a.maxOfSubordinates(arrm));
        System.out.println(a.maxOfSubordinates(arr));
        System.out.println(a.maxOfDiff(arr));
        System.out.println(a.maxOfDiff(arrm));
        System.out.println(a.minOfDiff(arr));
        System.out.println(a.minOfDiff(arrm));

    }

}
