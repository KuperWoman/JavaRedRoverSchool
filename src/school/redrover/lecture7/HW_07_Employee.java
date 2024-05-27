package school.redrover.lecture7;

public class HW_07_Employee extends HW_07_Person {

    int salary;

    boolean isSameName(HW_07_Employee employee) {
        if (name == null) return employee.name == null;
        return name.equals(employee.name);

//        if (name.equals(employee.name)){
//            return true;
//        } else {
//            return false;
//        }

    }

}



