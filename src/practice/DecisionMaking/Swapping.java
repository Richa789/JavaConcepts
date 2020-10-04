package practice.DecisionMaking;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scannerObject.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scannerObject.nextInt();
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("Firstnumber is " + firstNumber);
        System.out.println("Second number is " + secondNumber);
    }
}
