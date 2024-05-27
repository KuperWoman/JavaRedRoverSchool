package school.redrover.lecture9.car;

public class HW_09_1 {

    public static void main(String[] args) {

        LicensePlateMaker calMaker = new LicensePlateMaker("CA", 1);
        LicensePlateMaker nyMaker = new LicensePlateMaker("NY", 10);


        System.out.println(calMaker.makeNextPlate().getPlate());
        System.out.println(calMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());
        System.out.println(nyMaker.makeNextPlate().getPlate());


    }
}
