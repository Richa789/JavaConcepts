package practice.DecisionMaking;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanObject = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanObject.nextInt();
        if(number % 2 == 0) {
            System.out.println(number + " is an even number");
        }
        else {
            System.out.println(number + " is an odd number");
        }
    }
}
