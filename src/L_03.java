public class L_03 {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        int c = -20;
        int d = -50;

        System.out.print("b > a and c > a: ");
        System.out.println(b > a && c > a);


        if (c > 0 || d > 0) {
            System.out.println("OK!");
        } else {
            System.out.println("One of the vars is negative");
        }

//        System.out.println(a > b);
//        System.out.println(a < b);
//
//        System.out.println(a == b);
//        System.out.println(b == c);
//
//        System.out.println(15 != 20);
//
//        System.out.println(c <= 20);
//        System.out.println(b >= a);
    }
}


//        boolean itMoves = false;
//        boolean shouldItMove = true;
//
//        if (itMoves && !shouldItMove) {
//            System.out.println("Use duct tape");
//        } else if (!itMoves && shouldItMove) {
//            System.out.println("Use duct tape");
//        } else {
//            System.out.println("No problem");
//        }
//    }
//}

//        if (itMoves) {
//            if (shouldItMove) {
//                System.out.println("No problem");
//            } else {
//                System.out.println("Use duct tape");
//            }
//        } else {
//            if (shouldItMove) {
//                System.out.println("Use WS-40!");
//            } else {
//                System.out.println("No problem!");
//            }
//
//        }
//    }
//}

//
//    public static void main(String[] args) {
//        int totalOranges = 10;
//        int forCheburashka = 4;
//        int forGena = totalOranges - forCheburashka;
//        if (forCheburashka > forGena) {
//            System.out.println("Жадный Че!");
//        } else if (forGena > forCheburashka) {
//            System.out.println("Зеленый обнаглел!");
//        } else {
//            System.out.println("Оба молодцы");
//        }
//        System.out.println("ВСЕ!");
//    }
//}


//        if (forCheburashka * 2 > totalOranges) {
//            System.out.println("Жадный Че!");
//        } else {
//            System.out.println("Че молодец!");
//        }
//        System.out.println("ВСЕ!");
//    }

