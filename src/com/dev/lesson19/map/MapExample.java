package com.dev.lesson19.map;

import com.dev.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");

        /** Пример Map(Ассоциативный массив). */
        /** Уникальность ключа - главное требование для Map! */

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);

        System.out.println(map.get(2));

    }
}
