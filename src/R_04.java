import java.util.Arrays;

public class R_04 {
    public static void main(String[] args) {
        System.out.println("length = " + args.length);

int[] arr = {1, 2, 3};
System.out.println(Arrays.toString(arr));

arr = new int[10];
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}


//System.out.println(Arrays.toString(arr));
//
//for (int i = 0; i <= 2; i++) {
//    System.out.println(arr[i]);
//}



//int b = 60;
//
//int c;
//if (b > 20) {
//    c = 13;
//} else {
//    c = 0;
//}
//
//c = (b > 20) ? 13 : 0; //ternary operator


//if (b % 2 == 0){
//    System.out.println(2);
//}
//if (b % 3 == 0) {
//    System.out.println(3);
//}
//if (b % 4 == 0 ) {
//    System.out.println(4);
//}

//for (int i = 2; i <= 60; i = i + 1) {
//    if (b % i == 0) {
//        System.out.println(i);
//    }
//}

//        int i = 2;
//        while (i <= 60) {
//            if (b % i == 0) {
//                System.out.println(i);
//            }
//            i = i + 1;
//        }


//        int i = 60;
//        do {
//            System.out.println(i);
//            if (b % i == 0) {
//                System.out.println(i);
//            }
//            i = i + 1;
//        } while (i <= b);


//   int a = 10;
//   int b = 8;
//
//   if (b % 2 == 0) {
//       System.out.println("2");
//   } else if (b % 3 == 0) {
//       System.out.println("3");
//   } else if (b % 4 == 0) {
//       System.out.println("4");
//   }else if (b % 5 == 0) {
//       System.out.println("5");
//   }
//
//        if (b % 2 == 0) {
//            System.out.println("%2");
//        }
//        if (b % 3 == 0) {
//            System.out.println("%3");
//        }
//        if (b % 4 == 0) {
//            System.out.println("%4");
//        }
//        if (b % 5 == 0) {
//            System.out.println("%5");
//        }
//
//
//
//   int c = 5 + 3 * 4 + 2 / 2;
//
//   boolean isIt;
//
//   isIt = b == a; //операция сравнения, результат булеан
//   System.out.println(isIt);
//
//
//   isIt = b > a;
//   System.out.println("b = " + b);

//   if (b > a) System.out.println("b > a"); //возможный, но нежелательный вариант записи

//   if(b > 0){
//       System.out.println("b > 0");
//   } else if (b < -20) {
//       System.out.println("b < -20");
//   } else if (b > -3) {
//       System.out.println("b > -3");
//   } else {
//       System.out.println("something else");
//   }

//   if (isIt) {
//       System.out.println("b > a");
//   } else if (b == a){
//           System.out.println("b equals a");
//       } else {
//           System.out.println("b not greater than a");
//
//   }




//        System.out.println(b > a && b > c);
//        System.out.println("&&");
//        System.out.println(false && false);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(true && true);

//        System.out.println("||");
//        System.out.println(false || false);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(true || true);
//
//        System.out.println(true && true && false);
//        System.out.println(true || true && false);
//
//        && -в приоритете
//        && - логическое умножение;
//        || - логическое сложение;




    }
}
