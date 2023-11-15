package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    public char findFirstNonRepeatingChar(String str){
        Map<Character, Integer> map = new HashMap<>();

        var chars = str.toCharArray();
        for (var ch : chars) {
//            if(map.containsKey(ch)) {
//                var count = map.get(ch);
//                map.put(ch, count);
//            }else
//                map.put(ch, 1);

            var count = map.containsKey(ch) ? map.get(ch) : 0; // this the toneray operator and an easy way it makes the code clean
            map.put(ch, count + 1);
        }
            for (var ch : chars)
                if (map.get(ch) == 1)
                    return ch;

        return Character.MIN_VALUE;
    }
    public char findFirstRepeatedChar(String str) {
        Set<Character> set = new HashSet<>();

        for (var ch : str.toCharArray()){
            if (set.contains(ch))
                return ch;
            else
                set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
