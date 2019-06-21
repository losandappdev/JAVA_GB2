package lesson3;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import javax.naming.Name;

import lesson1.marathon.obstacles.Course;

public class Main {
    public static void main(String[] args) {
//        Random rnd = new Random();
        String[] arr = new String[]{"Друзья","Игра","Радость","Успех","Деньги","Погода",
                "Конфетки","Телефон","Дела","Семья","Привычка","Судьба","Ручка","Взгляд","Кровать","Выбор",
                "Институт","Мечты","Смех","Улыбка","Глаза","Взгляд","Смех"};

        uniqueWords(arr);

//        System.out.println(words);


    }

    public static void uniqueWords(String[] arr){
        ArrayList<String>  words = new ArrayList<>();
        Collections.addAll(words, arr);

        int count;
//        Iterator<String> wordsIterator = words.iterator();

        for (int i = words.size() - 2; i > 0; i--) {
            count = 1;
//            System.out.println(words.get(i));
            for (int j = i-1; j > -1; j--) {
//                System.out.println(words.get(i)+ "  " + words.get(j));
                if (words.get(i).equals(words.get(j))){

//                    System.out.println(words.get(i)+ "  " + words.get(j));
//                    words.remove(j);
                    count +=1;

                }
            }
//            words.remove(i);
            System.out.println(words.get(i) + "  " + count);
        }
    }
}
