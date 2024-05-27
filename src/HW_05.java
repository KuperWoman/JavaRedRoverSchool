import javax.swing.*;
import java.text.Format;

public class HW_05 {
    public static void main(String[] args) {

//        Задача №1
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива.
//
//        int sum = 0;
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        for (int i = 0; i < array.length; i++){
//            sum += array[i];
//        }
//        System.out.println(sum);

//        Задача №2
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.

//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//            }
//        }
//        System.out.println(max);

//        Задача №3
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.

//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < array.length; i++){
//            if (min > array[i]){
//                min = array[i];
//            }
//        }
//        System.out.println(min);

//        Задача №4
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.

//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int sum1 = 0;
//        for (int i = 0; i < array.length; i++){
//            sum1 += array[i];
//            }
//        int med = sum1 / array.length;
//        System.out.println(med);

//        Задача №5
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.

//        int[][] array = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9},
//                {-1, -2, -3, -4},
//                {-5, -6}
//        };
//        int sum2 = 0;
//        for (int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length; j++){
//                sum2 += array[i][j];
//            }
//        }
//        System.out.println(sum2);

//        Задача №6
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива.

//        int[][] array = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9},
//                {-1, -2, -3, -4},
//                {-5, -6}
//        };
//        int max1 = Integer.MIN_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (max1 < array[i][j]) {
//                    max1 = array[i][j];
//                }
//            }
//        }
//            System.out.println(max1);

//        Задача №7
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести количество элементов в массиве.

//        int[][] array = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9},
//                {-1, -2, -3, -4},
//                {-5, -6}
//        };
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
////            for (int j = 0; j < array[i].length; j++) {
////                count++;
//            count+= array[i].length; //второй более короткий вариант
//            }
//
//        System.out.println(count);

//        Задача №1
//        0  1  2  3  4  5  6  7  8  9
//        0  1  2  3  4  5  6  7  8
//        0  1  2  3  4  5  6  7
//        0  1  2  3  4  5  6
//        0  1  2  3  4  5
//        0  1  2  3  4
//        0  1  2  3
//        0  1  2
//        0  1
//        0


//        for (int i = 10; i >= 0; i--) {
//            for (int j = 10; j > i; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();

//        Задача 3

  for (int i = 10; i >= 0; i--) {
      for (int j = 10; j > i; j--) {
          System.out.print("  ");
      }
      for (int j = i - 1; j > 0; j--) {
          System.out.print(j + " ");
      }
      for (int j = 0; j < i; j++) {
          System.out.print(j + " ");
      }
            System.out.println();

//for (int i = 10; i >= 0; i--){
//    for (int j = 19; j > i; j--){
//        System.out.print("  ");
//    }
//    for (int j = 0; j < i; j++){
//        System.out.print(j + " ");
//    }
//    System.out.println();
//


//
//        int row = 10;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < row - i; j++) {
//                System.out.print(" " + j);
//            }
//            System.out.println();
//        }
//
////        Задача №2


        }
    }
}
