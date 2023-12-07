package lesson4.collections;

import java.util.*;

public class MapEx {
    public static void fillMap(Map<Integer, String> map) {
        map.put(1, "auto");
        map.put(343, "car");
        map.put(3, "heli");
        map.put(1, "plane");
        map.put(32, "bus");
        map.put(5, "ship");
        map.put(11, "autobus");
        map.put(7, "bus");
    }

    public static void main(String[] args) {
        //Хешмап не гарантирует порядка
        Map<Integer, String> hashMap = new HashMap<>();
        fillMap(hashMap);
        for (Map.Entry<Integer, String> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("========");
        //ЛинкедХешмап гарантирует порядок
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        fillMap(linkedHashMap);
        for (Map.Entry<Integer, String> entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("========");
        //тримап упорядочивает по возрастанию по ключу
        Map<Integer, String> treeMap = new TreeMap<>();
        fillMap(treeMap);
        for (Map.Entry<Integer, String> entry: treeMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("========");
    }
}
