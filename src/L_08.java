public class L_08 {


    public L_08() {
    }

    public static void main(String[] args) {

        Object obj = new Object();


        Person p1 = new Person("Sergey", 30);
        Person p2 = new Person("Anna", 31);

//        p1.name = "Sergey";
//        p1.age = 30;

        p1.setName("Mira");


        System.out.println(p1.getAge());
        p1.getName();
        p2.getName();




//        Person p2 = new Person();
//        p2.name = "Anna";
//        p2.age = 30;
//
//        Worker w = new Worker();
//        w.name = "Anna";
//        w.age = 30;
//        w.salary = 1000;
//
//        school.redrover.lecture9.L_09.Manager m = new school.redrover.lecture9.L_09.Manager();
//        m.count = 3000;
//
//
//        System.out.println(w.getName());
    }
}
