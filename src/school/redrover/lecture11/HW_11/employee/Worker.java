package school.redrover.lecture11.HW_11.employee;

import school.redrover.lecture11.HW_11.employee.Employee;

public class Worker extends Employee {

//    public Worker(String name, double baseSalary, double salary) {
//        super(name, baseSalary, salary);
//    }
//
//    public Worker(String name) {
//        super(name, 0, 0 );
//    }


        @Override
        public final double getSalary () {

            return super.getBaseSalary();
        }


    }

