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
                "Институт","Мечты","Институт","Улыбка","Глаза","Дом","Автомобиль"};

//        uniqueWords(arr);

         TeleDirectory teleDirectory = new TeleDirectory();

        teleDirectory.add("Васин", 89245558899);
        teleDirectory.add("Милонов", 89525654787);
        teleDirectory.add("Смирнов", 89116547898);
        teleDirectory.add("Минц", 89632564578);
        teleDirectory.add("Ротенберг", 89457897878);
        teleDirectory.add("Потанин ", 89551234565);
        teleDirectory.add("Милонов", 89784561232);
        teleDirectory.add("Абрамович", 89743574562);
        teleDirectory.add("Матвиенко", 97841234598);

        System.out.println(teleDirectory.get("antonyan"));
        System.out.println(teleDirectory.get("igoryan"));
        System.out.println(teleDirectory.get("bobov"));
        System.out.println(teleDirectory.get("smetanov"));

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
