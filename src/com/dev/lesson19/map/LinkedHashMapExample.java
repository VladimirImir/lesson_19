package com.dev.lesson19.map;

import com.dev.lesson19.person.Person;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Person ivan = new Person(10, "Ivan", "Ivanov");
        Person petr = new Person(11, "Petr", "Petrov");
        Person sveta = new Person(12, "Sveta", "Svetikova");

        /** HashMap - не гарантирует порядка! */
        // Map<Integer, Person> map = new HashMap<>();

        /** LinkedHashMap - гарантирует порядок! */
        Map<Integer, Person> map = new LinkedHashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.putIfAbsent(sveta.getId(), sveta);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
