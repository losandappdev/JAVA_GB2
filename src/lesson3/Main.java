package lesson3;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import javax.naming.Name;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        String[] arr = new String[]{"Друзья","Игра","Радость","Успех","Деньги","Зависимость",
                "Конфетки","Телефон","Дела","Семья","Привычка","Судьба","Ручка","Взгляд","Кровать","Выбор",
                "Институт","Мечты","Память","Смех","Улыбка","Глаза","Взгляд","Жизнь"};


        ArrayList<String>  words = new ArrayList<>();
        Collections.addAll(words, arr);
        System.out.println(words);
    }


}
