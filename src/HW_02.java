public class HW_02 {

    public static void main(String[] args) {

        int a = 45;
        int b = 12;

       int c = a + b;
       int d = a - b;
       int e = a * b;
       int f = a / b;
       int g = a % b;
       int h = a % 2;
       int i = b % 2;

        System.out.println("сложение " +c+ "\nвычитание " +d+ "\nумножение " +e+ "\nцелочисленное деление " +f+ "\nостаток от деления " +g+ "\nпроверка на четность " +h+ "\nпроверка на четность " +i);

        System.out.println(1.0 * a / b);
        System.out.println("a is odd: " + a % 2);
        System.out.println("b is odd: " + b % 2);

        double a1 = 45.0;
        double b1 = 12.0;
        double f1 = a1 / b1;


        System.out.println("обычное деление " +f1);


    }
}
