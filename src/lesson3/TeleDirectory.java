package lesson3;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TeleDirectory {
    private Map<String, ArrayList<Integer>> teleDirectory;

    ArrayList<Integer> pNumber;

    public TeleDirectory() {
        teleDirectory = new TreeMap<>();
        pNumber = new ArrayList<>();
    }


    public void add(String name, Integer phoneNumber){
        if (teleDirectory.containsKey(name)) {
            pNumber.add(phoneNumber);
            teleDirectory.put(name,pNumber);
        } else {
            pNumber = new ArrayList<>();
            pNumber.add(phoneNumber);
            teleDirectory.put(name, pNumber);
        }
    }

    public Iterable<Integer> get(String name) {
        return teleDirectory.get(name);
    }
}
