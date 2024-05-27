package extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {


//        Методы ArrayList и связанные с ArrayList

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

//       Метод Arrays.asList(DataType[]) -> List1<DataType>

        StringBuilder[] array = {sb1,sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array);
        // здесь array и list связаны,
        // лист будет иметь всегда те же элементы и длину, что и массив
        System.out.println(list);
//        array[0].append("!!!");
        array[0] = new StringBuilder("F");
        System.out.println(list);

//        Метод removeAll(Collection <?> c) -> boolean

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Mariya");
//        arrayList2.add("Igor");

//        arrayList1.removeAll(arrayList2);

//        Метод retainAll(Collections <?> c) -> boolean
//        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);

//        Метод containsAll(Collections <?> c) -> boolean
        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println(result);

//        Метод subList(int fromIndex, int toIndex) -> List1<E>
        List<String> myList = arrayList1.subList(1, 4);
        //myList не существует отдельно, это предстваление (view) arrayList1
        System.out.println("Array list = " + arrayList1);
        System.out.println("Sub list = " + myList);
        myList.add("Fedor");
        System.out.println("Sub list = " + myList);
        System.out.println("Array list = " + arrayList1);
        arrayList1.add("Sveta");
        System.out.println("Array list = " + arrayList1);
        myList = arrayList1.subList(1, 4);
        System.out.println("Sub list = " + myList);

//        Метод toArray() -> Object[]
        Object[] array1 = arrayList1.toArray();

//        Метод toArray(T[]a) -> T[]
        String [] array3 = arrayList1.toArray(new String[0]);//при указании длины больше, лишние будут null
        for (String s: array3) {
            System.out.println(s);
        }

//        Метод List1.of(E... elements) -> List1<E> и List1.copyOf(Collection<E>c) -> List1<E>
//        вышли после 8 java

        List<Integer> list2 = List.of(3, 8, 13);
        System.out.println(list2);
//        list2.add(100);

        List<String> list3 = List.copyOf(arrayList1);
        //эти листы нельзя модифицировать, они не могут содержать значения null
        System.out.println(list3);













    }
}
