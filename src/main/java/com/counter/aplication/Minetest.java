package com.counter.aplication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Minetest {


    public static Map<String, Integer> toSetList(String text){
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        String[] words = new String[text.split(" ").length];
        words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            if (stringIntegerMap.containsKey(words[i])){
                stringIntegerMap.get()
            }
        }


        return stringIntegerMap;
    }

    public static void main(String[] args) {
        String text = " wiele razy chciałe sprawdzić co tam u niej naprawde wiele wiele razy";

        toSetList(text);
    }
}
