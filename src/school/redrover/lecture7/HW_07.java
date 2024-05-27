package school.redrover.lecture7;

public class HW_07 {

    public static void main(String[] args) {

//        Task #1
        HW_07_Employee p1 = new HW_07_Employee();
        p1.name = null;
        p1.age = 22;
        p1.sex = 'f';
        p1.salary = 2500;


        HW_07_Employee p2 = new HW_07_Employee();
        p2.name = "Robert";
        p2.age = 25;
        p2.sex = 'm';
        p2.salary = 3800;


        HW_07_Employee p3 = new HW_07_Employee();
        p3.name = "Mia";
        p3.age = 30;
        p3.sex = 'x';
        p3.salary = 3200;


        HW_07_Employee [] arr = {p1, p2, p3};
//        school.redrover.lecture7.HW_07_Salary a = new school.redrover.lecture7.HW_07_Salary();
//        System.out.println(a.getSum(arr));
        System.out.println(HW_07_Salary.getSum(arr));

        System.out.println(p3.getName());

        System.out.println(p1.isSameName(p2));

        System.out.println();




    }
}
