package com.dev.lesson19.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        /** 19.14 Старые коллекции - просто ознакомились с ними.*/

        /** HashSet */
        /** LinkedHashSet<>() - сохраняет порядок. */
        /** TreeSet<>() - сохраняет в алфавитном порядке. */
        /** Для сортировки нужно использовать только TreeSet. */
        Set<String> set = new TreeSet<>();
        System.out.println(set.add("ddd"));
        System.out.println(set.add("aaa"));
        System.out.println(set.add("bbb"));
        System.out.println(set.add("ccc"));
        System.out.println(set.add("bbb"));

        System.out.println(set);

        for (String value : set) {
            System.out.println(value);
        }
    }
}
