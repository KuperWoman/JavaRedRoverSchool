package school.redrover.lecture11.L_11;

public class Main {

    public static void main(String[] args) {

        RefrigeratorCooler myFridge = new RefrigeratorCooler(25);
        myFridge.adjustTemp(23);
        myFridge.adjustTemp(24);
        myFridge.adjustTemp(25);
        myFridge.adjustTemp(26);
        myFridge.adjustTemp(25);
        myFridge.adjustTemp(24);

        System.out.println("=================");

        WindowCooler myCooler = new WindowCooler(25);
//        FujitsuCooler myCooler = new FujitsuCooler(25);
        myCooler.adjustTemp(23);
        myCooler.adjustTemp(24);
        myCooler.adjustTemp(25);
        myCooler.adjustTemp(26);
        myCooler.adjustTemp(25);
        myCooler.adjustTemp(24);

//        Cooler c = new Cooler(23);


        System.out.println("=================");
        final int a;
        a = 2;
        System.out.println(a);
//        a = a + 1;
//        System.out.println(a);

        final Grade dvojka = new Grade(2);
        System.out.println(dvojka.isPAssingGrade());
        System.out.println(new Grade(5).isPAssingGrade());

        System.out.println(Grade.isThisAGoodGrade(3));
        System.out.println(Grade.isThisAGoodGrade(2));
        System.out.println(Grade.isThisAGoodGrade(5));



        StringUtils.concat("aaa", "bbb");


    }
}
