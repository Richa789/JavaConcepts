package practice.Maps;

import java.util.HashMap;

public class HashPractice {
    public static <HashMAp> void main(String[] args) {
        HashMap<String, Integer> animal = new HashMap<>();
        animal.put("Lion", 1);
        animal.put("Tiger", 2);
        animal.put("Elephant", 3);
        animal.put("Cat", 4);

        HashMap<String, Integer> animal2 = new HashMap<>();
        animal2.putAll(animal);
        System.out.println(animal2);
        animal2 = (HashMap)animal.clone();
        System.out.println(animal2);
        System.out.println(animal.keySet());
        System.out.println(animal.entrySet());





    }
}
