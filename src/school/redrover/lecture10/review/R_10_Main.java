package school.redrover.lecture10.review;

public class R_10_Main {
    public static void main(String[] args) {

        R_10_Employee john = new R_10_Employee("John", 33, 1200) ;
//        john.firstName = "Johnny" ;
        R_10_Person jane = new R_10_Person("Jane", 32);
        System.out.println(john.getFirstName());
        john.setFirstName("Johnny");
        System.out.println(john.getFirstName());
        System.out.println(john);
        System.out.println(jane);
        System.out.println("==================");
        System.out.println(john.getAsString());
        System.out.println(jane.getAsString());

    }


}
