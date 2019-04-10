package com.counter.aplication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Minetest {


    public static Map<String, Integer> toSetList(String text){
        Map<String, Integer> stringIntegerMap = new HashMap<String, Integer>();
        String[] words = new String[text.split(" ").length];
        words = text.split(" ");


        for (int i = 0; i < words.length; i++) {
            if (stringIntegerMap.containsKey(words[i])){
                Integer count = stringIntegerMap.get(words[i]);
                stringIntegerMap.put(words[i], count+1);
            }else {
                stringIntegerMap.put(words[i], 1);
            }
        }
        return stringIntegerMap;
    }

    public static void main(String[] args) {
        String text = "wiele razy chciałe sprawdzić co tam u niej naprawdę wiele wiele razy, oh naprawdę naprawdę";

        System.out.println(toSetList(text));
    }
}
