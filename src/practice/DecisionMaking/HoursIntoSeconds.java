package practice.DecisionMaking;

import java.util.Scanner;

public class HoursIntoSeconds {
    public static void main(String[] args) {
      int  hours = convert(12);
        System.out.println("Number of seconds in given hours : " + hours + " secs");
    }
    public static int convert(int h) {
        return h*60*60;
    }
}
