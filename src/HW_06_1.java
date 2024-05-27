public class HW_06_1 {

    public static int sumNum(int a, int b){
        return (a + b);
    }

    public static int subtNum(int a, int b){
        return (a - b);
    }

    public static int multiNum(int a, int b){
        return (a * b);
    }

    public static int diviNum(int a, int b){
        return (a / b);
    }

    public static void main(String[] args) {

        System.out.println(sumNum(10, 8));
        System.out.println(subtNum(10, 8));
        System.out.println(multiNum(10, 8));
        System.out.println(diviNum(10, 8));


//        Необходимо написать 4 метода:
//        сложение 2х чисел
//        вычитание 2х чисел
//        умножение 2х чисел
//        деление 2х чисел



//        1. Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//        Для указанной строки ответ будет “ооооо” (или в столбик)

        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'о') {
                System.out.print(c);
            }
        }
        System.out.println("\n");


//        2. Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.

        String p = "Перевыборы выбранного президента";
        int e = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == 'е') {
                e++;
            }
        }
        System.out.println(e);


//        3. Дан массив:
//        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

        String[][] array = {
                {"Привет", "всем", "кто"},
                {"изучает", "язык", "прогреаммирования"},
                {"java"}
        };
//
        System.out.println("fghjkl");
        int count = 0;
        int count1 = 0;
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                count1++;
                if (array[i][j].contains("е")) {
                    count += 1;

                }
            }
        }
//        int a = array.length;
        System.out.println(count1 - count);
//        int count = 0;
//               for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j].contains("е")) {
//                    break;
//                } else {
//                    count += i;
//                }
//                ;
//                System.out.println(count);
            }
        }


//        * Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//        Для указанной строки ответ будет 6, 15, 29.

//        String s1 = "Посмотрите как Рите нравится ритм";
//        String s2 = s1.toLowerCase();
//        System.out.println(s2.contains("рит"));
//        System.out.println(s2);
//        int ind = s2.indexOf("рит");
//        while (ind != -1) {
//            System.out.println(ind);
//            ind = s2.indexOf("рит", ind+1);
//        }


//
//String k = "Посмотрите";
//        System.out.println(k.indexOf("i"));
//
//
//
//
//    }
//}
//
