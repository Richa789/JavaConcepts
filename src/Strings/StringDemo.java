package Strings;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String s = "I am a java developer";
        String[] delimiter = s.split(" ");
        String deli = "!!!!";
        String[] joinThisString = {"Richa", "is", "bad"};
        String finalStringJoined = String.join(deli, joinThisString);
        System.out.println(finalStringJoined);
        for (String element: delimiter) {
            System.out.println("Result of : " + element);
        }
    }
}
