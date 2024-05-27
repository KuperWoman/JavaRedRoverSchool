import java.util.Arrays;

public class L_06 {

    public static void printString(String str) {
        System.out.println(str);
    }
    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

//    методы не могут быть вложенными (условно)
//    можем вызывать его в других классах
//    переменная - поименованная область памяти,
//    а метод - это поименованный блок кода
//    когда метод что-то возвращает, вместо void указываем тип - что

    public static void main(String[] args) {

int x = getSum(9, 7);
        System.out.println(x);

        String s = "Hello world!";
        printString(s);
int a = 3;
int b = 7;
printSum(a, b);

//        int x = getSum(3,7);
//        System.out.println(x);

//        String s = "Hello world!";
//printSum(3,7);

//        printString("Sergey");


//        char[] arr = s.toCharArray();
//        arr[0] = 'X';
//        System.out.println(Arrays.toString(arr));



//        char c = '5';
//        String s = "Hello world!";
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            System.out.println(c);
//        }



//        String sU = s.toUpperCase();
//        System.out.println(sU);
//
//        int wIndex = s.indexOf("w");
//        String subSt = s.substring(6);
//        String subSt1 = s.substring(6,9);
//        String re = s.replace("l","!");
//        System.out.println(re);
//        System.out.println(wIndex);

//        String s = "Hello world!";
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//
//        String sU = s.toUpperCase();
//        System.out.println(sU);
//
//        int wIndex = s.indexOf('w');
//        System.out.println(wIndex);
////        строка - массив символов
//
//        String subStr = s.substring(6, 9);
//        System.out.println(subStr);
//
//        String rep = s.replace("l", "!");
//        System.out.println(rep);

//        имутобл стринг - строки меняться не могут, создается новая строка
//        переменную можно переписать, а строку заменить другой

//        тип char - в одиночных ''
//        у строки lenght с () - признак метода

//        char c = '5';

//        String s = "Hello world!";

//        for (int i = 0; i <s.length(); i++) {
//            char c = s.charAt(i);
//            System.out.println(c);
//        }

//        char[] arr = s.toCharArray();
//        arr[0] = 'X';
//        String str = "";
//        for (int i = 0; i <arr.length; i++) {
//            str += arr[i];
//            }
//        System.out.println(str);
//
//        System.out.println("X" + s.substring(1));





    }
}
