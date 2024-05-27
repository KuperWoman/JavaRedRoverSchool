package school.redrover.lecture11.HW_11.month;

import school.redrover.lecture11.HW_11.month.MonthUtils;

import java.util.Arrays;

public class Main_month {
    public static void main(String[] args) {

        System.out.println(MonthUtils.october.getMonthName());
        System.out.println(new MonthUtils().a13.getMonthName());

        System.out.println(Arrays.toString(MonthUtils.getSemester(2)));

        System.out.println(Arrays.toString(MonthUtils.ALL_MONTHS));
        System.out.println(Arrays.toString(MonthUtils.getYear()));

        Employee ben = new Employee("Ben", 100);
        Manager ida = new Manager("Ida", 100, 10);

        System.out.println("Ben's salary: " + ben.getSalary(MonthUtils.ALL_MONTHS));
        System.out.println("Ida's salary: " + ida.getSalary(MonthUtils.ALL_MONTHS));
        System.out.println("Ben's salary: " + ben.getSalary(MonthUtils.getYear()));
        System.out.println("Ida's salary: " + ida.getSalary(MonthUtils.getYear()));
        System.out.println(ben.getSalary(new Month[] {MonthUtils.january}));
        System.out.println(ida.getSalary(new Month[] {MonthUtils.january}));


    }



}
