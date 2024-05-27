package school.redrover.lecture9.month;

public class HW_09 {
    public static void main(String[] args) {

        HW_09_Employee e1 = new HW_09_Employee("Anna", 30, "f", 1000);
        HW_09_Employee e2 = new HW_09_Employee("Sergey", 35, "m", 100);

        HW_09_Manager m1 = new HW_09_Manager("Arthur", 32, "m", 100, 5);

        System.out.println(e2.getSalary(MonthUtils.SUMMER));
        System.out.println(m1.getSalaryM(MonthUtils.SUMMER));
        System.out.println(e2.getSalary(new Month[]{MonthUtils.january, MonthUtils.june, MonthUtils.july}));
        System.out.println(m1.getSalaryM(MonthUtils.ALL_MONTHS));



        MonthUtils a = new MonthUtils();


        double res = e1.getSalary(a.ALL_MONTHS);
        System.out.println(res);

        System.out.println(e1.workingDaysPerYear(a.ALL_MONTHS));

        System.out.println(m1.getSalary());
        System.out.println(m1.getSalaryM(a.ALL_MONTHS));




//    school.redrover.lecture9.month.Month m5 = new school.redrover.lecture9.month.Month("May", 31, 23);
//    school.redrover.lecture9.month.Month m10 = new school.redrover.lecture9.month.Month("October", 31, 22);


    }
}
