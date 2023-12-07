package lesson4.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void fillList(List<Integer> list){
        for (int i = 1; i <=10; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        fillList(linkedList);
        fillList(arrayList);

        System.out.println(linkedList);  //[1, 2, 3, 4, element, 5, 6, 7, 8, 9, 10]
        System.out.println(arrayList);  //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


    }

}
