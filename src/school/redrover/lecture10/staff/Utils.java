package school.redrover.lecture10.staff;

public class Utils {

    //    поиск сотрудника в массиве по его имени
    public Employee employeeByName(Employee[] arr, String name) {
        Employee res = null;
        for (Employee employee : arr) {
            if (employee.getName().equals(name)) {
                res = employee;
            }
        }
        return res;

    }

    //    поиск сотрудника в массиве по вхождению указанной строки в его имени
    public Employee employeeBySubname(Employee[] arr, String partOfName) {
        Employee res1 = null;
        for (Employee employee : arr) {
            if (employee.getName().contains(partOfName)) {
                res1 = employee;
            }
        }
        return res1;
    }

//    подсчет зарплатного бюджета для всех сотрудников в массиве
        public double sumOfSalary(Employee[] arr) {
            double sum = 0;
            for (Employee employee : arr) {
                sum += employee.getSalary();
            }
        return sum;
        }

//    поиск наименьшей зарплаты в массиве
public double minOfSalary(Employee[] arr) {
    double min = Integer.MAX_VALUE;
    for (Employee employee : arr) {
        if (employee.getSalary() < min) {
            min = employee.getSalary();
        }
    }
    return min;
}

//    поиск наибольшей зарплаты в массиве
public double maxOfSalary(Employee[] arr) {
    double max = Integer.MIN_VALUE;
    for (Employee employee : arr) {
        if (employee.getSalary() > max) {
            max = employee.getSalary();
        }
    }
    return max;
}

//    поиск наименьшего количества подчиненных в массиве менеджеров
public int minOfSubordinates(Manager[] arrm) {
    int min = Integer.MAX_VALUE;
    for (Manager manager : arrm) {
        if (manager.getNumberOfSubordinates() < min) {
            min = manager.getNumberOfSubordinates();
        }
    }
    return min;
}

    public int minOfSubordinates(Employee[] arr) {
        int min = Integer.MAX_VALUE;
        for (Employee employee : arr) {
            if (employee instanceof Manager && ((Manager) employee).getNumberOfSubordinates() < min) {
                min = ((Manager) employee).getNumberOfSubordinates();
            }
        }
        return min;
    }

//    поиск наибольшего количества подчиненных в массиве менеджеров
public int maxOfSubordinates(Manager[] arrm) {
    int max = Integer.MIN_VALUE;
    for (Manager manager : arrm) {
        if (manager.getNumberOfSubordinates() > max) {
            max = manager.getNumberOfSubordinates();
        }
    }
    return max;
}

    public int maxOfSubordinates(Employee[] arr) {
        int max = Integer.MIN_VALUE;
        for (Employee employee : arr) {
            if (employee instanceof Manager && ((Manager) employee).getNumberOfSubordinates() > max) {
                max = ((Manager) employee).getNumberOfSubordinates();
            }
        }
        return max;
    }

//    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
public double maxOfDiff(Employee[] arr) {
    double max = Integer.MIN_VALUE;
    for (Employee employee : arr) {
        if (employee instanceof Manager && !(employee instanceof Director)) {
            Manager manager = (Manager) employee;
            double diff = manager.getSalary() - manager.getBaseSalary();
            if (diff > max) {
                max = diff;
            }
        }
    }
    return max;
}
// employee.getSalary() != ((Director) employee).getSalary() &&
//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
public double minOfDiff(Employee[] arr) {
    double min = Integer.MAX_VALUE;
    for (Employee employee : arr) {
        if (employee instanceof Manager && (((Manager) employee).getSalary() - ((Manager) employee).getBaseSalary()) < min) {
            min = ((Manager) employee).getSalary() - ((Manager) employee).getBaseSalary();
        }
    }
    return min;
}

    }

