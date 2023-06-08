package com.dev.lesson19.map;

import com.dev.lesson19.person.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        /** List.of - возвращает неизменяемую коллекцию. Отсортировать его нельзя.
            Arrays.asList - предостовляе возможность отсортировать список.*/

        List<String> strings = Arrays.asList("123", "456", "14", "789");

        /** Сортировка - это просто упорядочивание эелементов колеекции по заданнм нами кретериям. */
        /** Утилитний класс - Collections и метод sort(). */

        Collections.sort(strings);
        System.out.println(strings);

        List<Person> personList = Arrays.asList(
                new Person(41, "Ivan", "Ivanov"),
                new Person(32, "Petr", "Petrov"),
                new Person(23, "Sveta", "Svetikova")
        );

        /** Вариант сортировки по id. */
        Collections.sort(personList);
        System.out.println(personList);

        /** Вариант сортировки по имени с помощью Comparator. */
        personList.sort(new FirstNameComparator());
        System.out.println(personList);

        /** Вариант сортировки по имени с помощью Comparator без создания Comparator-a # 2 */
        //personList.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));
        personList.sort(Comparator.comparing(Person::getFirstName));
        System.out.println(personList);
    }

    /** Создание объекта - Comparator. */

    public static class FirstNameComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }

}
