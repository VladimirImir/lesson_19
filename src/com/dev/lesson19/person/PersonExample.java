package com.dev.lesson19.person;

public class PersonExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(1, "Ivan", "Ivanov");
        // Person petr = new Person(2, "Petr", "Petrov");

        /** Тестирование методов equals() и hashCode(). */

        System.out.println(ivan.hashCode());
        System.out.println(petr.hashCode());
        System.out.println(ivan.equals(petr));
    }
}
