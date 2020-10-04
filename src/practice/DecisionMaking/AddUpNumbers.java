
        package practice.DecisionMaking;

import java.util.Scanner;

public class AddUpNumbers {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scannerObject.nextInt();
        int sum = 0;
        int nextNumber;
        while (number > 0) {
            sum = sum + number;
            nextNumber =  number - 1;
            number = nextNumber;
        }
       System.out.println("The result of adding up the numbers is " + sum);
    }
}





