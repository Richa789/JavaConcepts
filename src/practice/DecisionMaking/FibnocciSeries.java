package practice.DecisionMaking;

import java.util.Scanner;

public class FibnocciSeries {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        int next;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();
        for (int i = 0; i <= number; i++) ;
        {
           // System.out.println(firstNumber);
            next = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = next;
            System.out.println(firstNumber);
        }
    }
}


