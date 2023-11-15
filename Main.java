package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	     // key: Employee Number (Integer)
         // Value: Name (String)
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Mosh");
//        map.put(2, "John");
//        map.put(3, "Mary");
//        map.put(null, null);
//        map.remove(null);
//        var value = map.get(3);
//        map.containsKey(3); // 0(1)
//        map.containsValue("Mosh"); // O(n)
//        System.out.println(value);
//        System.out.println(map);
//
//        for (var item : map.entrySet()) // We can iterate keySet() and also map.entrySet()
//            System.out.println(item );
          Set<Integer> set = new HashSet<>();
          int[] numbers = {1, 2, 3, 3, 2, 1, 4};
          for (var number : numbers)
              set.add(number);
        System.out.println(set);
        Map<String, String> map = new HashMap<>();
        map.put("123456", "Mosh");
        // items[1] = "Mosh"
        //100
        //0-99
        System.out.println(hash("2933647"));
        String str = "orange";
        System.out.println(str.hashCode());
        int math = ((15 + 2)%19);
        System.out.println(math + "dfjhjvoied");
    }
    public static int hash(String key) {
        int hash = 0;
        for (var ch : key.toCharArray())
            hash += ch; //The character will atoumatically get converted int an integer this implicit casting
        return hash % 100;
    }
}
