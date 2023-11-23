package org.example;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main
{
    public static void main(String[] args){

        // Массив имен
        String[] names = {"Dog", "Cat", "Cow", "Goat", "Sun", "Arrow", "Watch","Moon", "Computer", "Chair","Shower","Porridge","Grass","House","Clock"};

        // Создаем HashSet для уникальных имен и помещаем в него имена из массива
        HashSet<String> uniqueNames = new HashSet<>(Arrays.asList(names));

        // Создаем HashMap для подсчета повторяющихся имен
        HashMap<String, Integer> wordList = new HashMap<>();

        // Перебираем массив имен
        for (String name : uniqueNames) {
            // Проверяем, содержит ли HashMap уже это имя
            if (wordList.containsKey(name)) {
                // Если содержит, то увеличиваем счетчик на 1
                wordList.put(name, (wordList.get(name) + 1));
            } else {
                // Если не содержит, то добавляем имя в HashMap со счетчиком равным 1
                wordList.put(name, 1);
            }
        }

        // Выводим результаты подсчета повторяющихся имен
        System.out.println(wordList.entrySet());

        // Создаем объект класса Translator
        Translator perevod = new Translator();

        // Добавляем переводы имен в объект Translator
        perevod.addTranslation("Dog", "Собака");
        perevod.addTranslation("Cat", "Кот");
        perevod.addTranslation("Cow", "Корова");
        perevod.addTranslation("Goat", "Козёл");
        perevod.addTranslation("Sun", "Солнце");
        perevod.addTranslation("Arrow", "Стрела");
        perevod.addTranslation("Watch" , "Часы");
        perevod.addTranslation("Moon", "Луна");
        perevod.addTranslation("Computer", "Компьютер");
        perevod.addTranslation("Chair", "Стул");
        perevod.addTranslation("Shower", "Душ");
        perevod.addTranslation("Porridge", "Каша");
        perevod.addTranslation("Grass", "Трава");
        perevod.addTranslation("House","Дом");
        perevod.addTranslation("Clock","Часы");
        perevod.addTranslation("Moon", "Сыр");
        perevod.addTranslation("Porridge", "Арбуз");
        perevod.addTranslation("Grass", "Трава");
        perevod.addTranslation("Abstract", "Трава");

        // Выводим все переводы
        perevod.getAllTranslations();
    }
}