package org.example;

import java.util.*;

public class Translator {
    //Создаем переменную translations типа TreeMap, которая будет хранить переводы слов.
    private TreeMap<String, LinkedList<String>> translations = new TreeMap<>();

    //Метод addTranslation добавляет перевод слова в translations.
    public void addTranslation(String word, String translation) {

        //Создаем переменную existingWord типа String и присваиваем ей значение null.
        String existingWord = null;

        //Проходим по каждой записи в translations.
        for (Map.Entry<String, LinkedList<String>> entry : translations.entrySet()) {

            //Проверяем, содержит ли значение LinkedList в entry перевод translation.
            if (entry.getValue().contains(translation)) {

                //Если содержит, то присваиваем existingWord значение ключа entry и выходим из цикла.
                existingWord = entry.getKey();
                break;
            }
        }

        //Проверяем, существует ли слово word в translations и является ли existingWord равным word.
        if (existingWord != null && existingWord.equals(word)) {

            //Если да, выводим сообщение об ошибке.
            System.out.println("Перевод " + translation + " для слова " + word + " уже существует.");
            return;
        }

        //Проверяем, существует ли слово existingWord в translations.
        else if (existingWord != null) {

            //Если да, выводим сообщение об ошибке.
            System.out.println("Перевод " + translation + " уже существует для слова " + existingWord + ", невозможно добавить для слова " + word + ".");
            return;
        }

        //Проверяем, содержит ли translations слово word.
        if (translations.containsKey(word)) {

            //Если да, добавляем translation в LinkedList translations по ключу word.
            translations.get(word).addLast(translation);
        }

        //Если нет, создаем новый LinkedList c элементом translation и добавляем его в translations по ключу word.
        else {
            translations.put(word, new LinkedList<>(Collections.singletonList(translation)));
        }
    }

    //Метод getTranslations выводит переводы слова word из translations.
    public void getTranslations(String word) {

        //Проверяем, содержит ли translations слово word.
        if (this.translations.containsKey(word)) {

            //Если да, выводим переводы слова word.
            System.out.println(this.translations.get(word).toString());
        }
    }

    //Метод getAllTranslations выводит все переводы из translations.
    public void getAllTranslations() {

        //Проходим по каждой записи в translations.
        for (var entry : translations.entrySet()) {

            //Получаем ключ entry.
            String word = entry.getKey();

            //Получаем значение entry.
            LinkedList<String> translations = entry.getValue();

            //Выводим слово и его переводы.
            System.out.println(word + ": " + translations);
        }
    }

}