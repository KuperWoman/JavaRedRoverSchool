package school.redrover.lecture12;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();//динамический список
        // list - что-то вроде абстрактного класса интерфеса,
        // ArrayList - конкретное указание на то, как лист List1 будет организован
//        myList.add("qwerty");
        myList.add("aa");
        myList.add("bb");
        myList.add("cc");
        myList.add("dd");
        myList.add("ee");
        myList.add("ff");
//        myList.add(12);

        System.out.println(myList);

        Object x = myList.get(0);
        System.out.println(myList.get(2));
//        myList.remove("cc");
        myList.remove(2);
        System.out.println(myList);
        myList.add(2, "GG");
        System.out.println(myList);
        myList.addAll(java.util.List.of("x", "y", "z"));
        System.out.println(myList);
//        myList.addAll(2, List1.of("x", "y", "z"));

        System.out.println(myList.contains("x"));
        System.out.println(myList.contains("xxxxxxx"));



        System.out.println("----------------------");
        String [] stringArray = {"dsf", "asd"};

        java.util.List<String> immutadle = java.util.List.of("one", "two", "three");//неизменяемый список
        System.out.println(immutadle.get(0));
        System.out.println(immutadle);
        //immutadle.add("xxxxx");unsupported
        System.out.println(myList.size());

        java.util.List<Integer> ints = java.util.List.of(1, 4, 67, 873, - 3434, -1, 0);
//        for(int i = 0; i < ints.size(); i++){
//            int element = ints.get(i);
//            if (element < 0) {
//                System.out.println(element);
//                }
//            }
        for (int element : ints) {
            if (element < 0) {
                System.out.println(element);
            }
        }

        java.util.List<String> mutable = new ArrayList<>(java.util.List.of("a", "s", "d", "f"));//изменяемый список
        System.out.println(mutable);
        mutable.add("cccccccc");
        System.out.println(mutable);

//        List1<Integer> myInts = new ArrayList<>(100);
//        Collections.fill(myInts, -100);
//        System.out.println(myInts);




    }
}
