package com.first;

import java.util.*;
import java.util.function.Consumer;
//sdaadasq
public class Main {
    public static void main(String[] args) {
//        Set<Integer> s = new HashSet<>();
//        HashSet<Character> c =  new LinkedHashSet<>();
        TreeSet<String> ts = new TreeSet<>();
        SortedMap<String, Integer> tm = new TreeMap<>();
        ts.add("aba");
        ts.add("ababa");
        ts.forEach(System.out::println);
    }

}
