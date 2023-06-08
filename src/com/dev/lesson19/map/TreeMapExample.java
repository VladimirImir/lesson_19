package com.dev.lesson19.map;

import com.dev.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Person ivan = new Person(55, "Ivan", "Ivanov");
        Person petr = new Person(56, "Petr", "Petrov");
        Person sveta = new Person(53, "Sveta", "Svetikova");
        Person vova = new Person(54, "Vova", "Vladimitovich");
        Person sasha = new Person(51, "Sasha", "Aleksandrovich");
        Person zina = new Person(52, "Zina", "Zinavna");

        /** TreeMap<>() - автоматически сортирует по ключу если ключ Integer. */
        Map<Integer, Person> map = new TreeMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.putIfAbsent(sveta.getId(), sveta);
        map.putIfAbsent(vova.getId(), vova);
        map.putIfAbsent(sasha.getId(), sasha);
        map.putIfAbsent(zina.getId(), zina);

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
