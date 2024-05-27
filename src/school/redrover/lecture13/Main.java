package school.redrover.lecture13;

public class Main {

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static void testGetSum() {
        System.out.println(getSum(0,0) == 0);
        System.out.println(getSum(5,5) == 10);
        System.out.println(getSum(1_000_000_000,1_000_000_000) == 2_000_000_000);
        System.out.println(getSum(-5,-5) == -10);
    }

    public static void main(String[] args) {
        System.out.println(getSum(2, 4));

    }
 }
