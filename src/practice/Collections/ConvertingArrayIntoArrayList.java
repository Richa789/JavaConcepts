package practice.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingArrayIntoArrayList {

    public static void main(String[] args) {

        String[] arr = {"Dog", "Horse", "Elephant", "Cat"};
        for(String str : arr) {
            System.out.println(str);
        }
        ArrayList<String> animals = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Conversion is : "+ animals);




    }
}
