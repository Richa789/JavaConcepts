package practice.Collections;

import java.util.ArrayList;

public class ConvertingArraylistIntoArray {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Elephant");
        animals.add("Tiger");
        System.out.println("Array list : " + animals);

        String[] animal = new String[animals.size()];
        animals.toArray(animal);
        for(String ani : animal) {
            System.out.println(ani);
        }

        String str = animals.toString();
        System.out.println("Conversion into String is : " + str);
    }
}
