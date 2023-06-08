package com.dev.lesson19.map;

import com.dev.lesson19.person.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");
        Person sveta = new Person(3, "Sveta", "Svetikova");

        /** Все ключи Map - Уникальны!!! */
        /** Уникальность ключа - должна соблюдаться!!! */
        /** Если Свету разместить по айди Вани - то Света перетрет Ваню если у них будет совпадать ключ. */
        // Person sveta = new Person(1, "Sveta", "Svetikova");
        // map.put(sveta.getId(), sveta);

        /** Пример Map(Ассоциативный массив). */
        /** Уникальность ключа - главное требование для Map! */

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);

        /** keySet() - выводит все ключи. */
        System.out.println(map.keySet());

        /** values() - выводит все значения. */
        System.out.println(map.values());

        /** Node<K, V> реализует интерфейс Entry<K, V> */
        /** entrySet() - выводит все ключи и значения . */
        System.out.println(map.entrySet());

        /** Итерирование по Map. */
        for (Person person : map.values()) {
            System.out.println(person.getFirstName());
        }

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }

        /** Полезные методы Map. */
        /** containsKey() - можем определить есть ли в нашей Map Node с таким ключем. */
        /** size() - можем определить размер нашей Map. */
        /** isEmpty() - можем проверить пустая ли Map. */
        /** getOrDefault() - если под 6 ключем ничего нету то тогда вернуть свету. */
        System.out.println(map.containsKey(2));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault(6, sveta));

        // System.out.println(map.get(2));

    }
}
