package CommonPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanObj.nextInt();
        if(number == 1) {
            System.out.println("Smallest prime number is 2");
        }
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                System.out.println(number + " is not a prime number");
                break;
            }
            if(number % i == 1) {
                System.out.println(number + " is a prime number");
                break;
            }
        }
    }
}
