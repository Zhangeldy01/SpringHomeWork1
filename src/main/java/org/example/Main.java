package org.example;

import com.google.gson.Gson;

/**
 * Домашнее задание
 * Условие:
 * Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и написать код,
 * использующий эти зависимости.
 * Пример решения:
 * 1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
 * 2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
 * 3. Создайте класс Person с полями firstName, lastName и age.
 * 4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
 * 5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON
 */

public class Main {
    public static void main(String[] args) {
        // Creating the new person
        Person person = new Person();
        person.setFirstName("Ben");
        person.setLastName("Affleck");
        person.setAge(51);

        // Serialization in JSON
        Gson gson = new Gson();
        String serJson = gson.toJson(person);
        System.out.println("JSON: " + serJson);

        // Deserialization from JSON
        Person deserPerson = gson.fromJson(serJson, Person.class);
        System.out.println("Deserialized Person: " + deserPerson);

    }
}