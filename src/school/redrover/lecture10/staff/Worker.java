package school.redrover.lecture10.staff;

public class Worker extends Employee {

//    public Worker(String name, double baseSalary, double salary) {
//        super(name, baseSalary, salary);
//    }
//
//    public Worker(String name) {
//        super(name, 0, 0 );
//    }



    @Override
    public double getSalary () {
        return super.getBaseSalary();
    }


}
