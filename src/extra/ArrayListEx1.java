package extra;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>(); // выделилось 10 мест (capacity);
        // при добавлении 11го первые 10 копируются и становятся первым элементом нового массива
        // + еще сколько-то мест(9?)
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
//        arrayList1.add(50); - тип задан при создании, менять нельзя, null можно
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Zaur");
        arrayList2.add("Ivan");

        List<String> arrayList3 = new ArrayList<>();

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
        System.out.println(arrayList1 == arrayList4);

        ArrayList arrayList5 = new ArrayList(); // так не надо
        // почему берет все типы - потому что элементы листа - Object
        arrayList5.add("Zaur");
        arrayList5.add("Ivan");
        arrayList5.add("Mariya");
        arrayList5.add(50);
        arrayList5.add(new Car());



    }

}

class Car{}