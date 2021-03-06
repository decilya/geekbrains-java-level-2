package ilya_v.java2.lesson_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class Main {

    public static int calcWord(ArrayList<String> arrList, String word) {
        return Collections.frequency(arrList, word);
    }

    public static void main(String[] args) {

        /*  1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
           Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
           Посчитать сколько раз встречается каждое слово. */

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("умаять");
        wordList.add("подвздошный");
        wordList.add("разъясняться");
        wordList.add("лечить");
        wordList.add("лечить");
        wordList.add("фарцовщица");
        wordList.add("гудронный");
        wordList.add("петербуржец");
        wordList.add("безалкогольный");
        wordList.add("фарцовщица");
        wordList.add("прилипало");
        wordList.add("притворство");
        wordList.add("умаять");
        wordList.add("гудронный");
        wordList.add("раскислый");
        wordList.add("танцор");
        wordList.add("окказионалист");
        wordList.add("притворство");
        wordList.add("умелица");
        wordList.add("гудронный");

        for (int i = 0; i < wordList.size(); i++) {
            if (calcWord(wordList, wordList.get(i)) == 1) {
                System.out.println(wordList.get(i));
            }
        }

        /*
           2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
           В этот телефонный справочник с помощью метода add() можно добавлять записи.
           С помощью метода get() искать номер телефона по фамилии.
           Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
           тогда при запросе такой фамилии должны выводиться все телефоны.

           Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись
            добавлять еще дополнительные поля (имя, отчество, адрес),
            делать взаимодействие с пользователем через консоль и т.д.).
            Консоль желательно не использовать (в том числе Scanner),
            тестировать просто из метода main() прописывая add() и get().
        */

        // https://github.com/decilya/geekbrains-java-level-2/blob/master/lesson_3/src/ilya_v/java2/lesson_3/PhoneBook.java
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Арсен Ярополкович Творожок", "8(960)274-44-10");
        System.out.println("Номер Арсена Ярополковича Творожока: " +
                myPhoneBook.get("Арсен Ярополкович Творожок"));

        myPhoneBook.add("Напримеров", "314-6-824");
        System.out.println("Номер Напримерова: " +myPhoneBook.get("Напримеров"));

        System.out.println();
        System.out.println("------------");
        System.out.println();

        myPhoneBook.printAllBook();

    }
}
