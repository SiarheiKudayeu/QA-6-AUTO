package lesson4.collections;

import java.util.*;

public class SetEx {

    public static void fillList(Set<String> set){
       set.add("auto");
       set.add("car");
       set.add("heli");
       set.add("plane");
       set.add("bus");
       set.add("ship");
       set.add("autobus");
       set.add("bus");
        }



    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        //Хешсет не гарантирует порядка
        fillList(hashSet);
        for(String auto: hashSet){
            System.out.println(auto);
        }
        System.out.println("=========");
        //ЛинкедХешсет нгарантирует порядок
        fillList(linkedHashSet);
        for(String auto: linkedHashSet){
            System.out.println(auto);
        }
        System.out.println("=========");
        //триСет упорядочивает по возрастанию
        fillList(treeSet);
        for(String auto: treeSet){
            System.out.println(auto);
        }
    }
}
