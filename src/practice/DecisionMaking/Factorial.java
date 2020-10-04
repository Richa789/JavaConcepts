package practice.DecisionMaking;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scannerObj.nextInt();
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
            }
            System.out.println("Factorial of" + number + " is " + factorial);
        }
    }


