package lesson3;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;

import javax.naming.Name;

import lesson1.marathon.obstacles.Course;

public class Main {
    public static void main(String[] args) {
//        Random rnd = new Random();
        String[] arr = new String[]{"Друзья","Игра","Радость","Успех","Дела","Погода",
                "Конфетки","Телефон","Дела","Семья","Привычка","Судьба","Ручка","Взгляд","Кровать","Выбор",
                "Институт","Мечты","Институт","Улыбка","Глаза","Дом","Автомобиль","Автомобиль"};
        /**Задание 1.*/
        uniqueWords(arr);

        /**Задание 2.*/

        TeleDirectory teleDirectory = new TeleDirectory();

        teleDirectory.add("Васин", 5558899);
        teleDirectory.add("Виленкин", 5654787);
        teleDirectory.add("Милонов", 6547898);
        teleDirectory.add("Абрамович", 2564578);
        teleDirectory.add("Ротенберг", 7897878);
        teleDirectory.add("Потанин ", 1234565);
        teleDirectory.add("Милонов", 4561232);
        teleDirectory.add("Абрамович", 3574562);
        teleDirectory.add("Сечин", 1111111);
        teleDirectory.add("Миллер", 1234598);
        teleDirectory.add("Матвиенко", 1234598);
        teleDirectory.add("Усманов", 2222222);
        teleDirectory.add("Виленкин", 3333333);

        System.out.println(teleDirectory.get("Васин"));

        System.out.println(teleDirectory.get("Милонов"));
        System.out.println(teleDirectory.get("Абрамович"));
        System.out.println(teleDirectory.get("Матвиенко"));
        System.out.println(teleDirectory.get("Ротенберг"));
        System.out.println(teleDirectory.get("Виленкин"));
        System.out.println(teleDirectory.get("Усманов"));

    }

    public static void uniqueWords(String[] arr){
        ArrayList<String>  words = new ArrayList<>();
        Collections.addAll(words, arr);

        int count;
//        Iterator<String> wordsIterator = words.iterator();

        for (int i = words.size() - 1; i > 0; i--) {
            count = 1;
//            System.out.println(words.get(i));
            for (int j = i-1; j > -1; j--) {
                if (words.get(i).equals(words.get(j))){

                    words.remove(j);
                    i-=1;
                    count +=1;

                }
            }
            System.out.println("Слов  " + words.get(i) + "  в массиве " + count + " шт.");
        }
    }
}
