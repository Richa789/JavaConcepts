package practice.DecisionMaking;

import java.util.Scanner;

public class ReverseAndPalindrome {
    public static void main(String[] args) {
        int reverse = 0, modresult;
        int temp;
        Scanner scanObject = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanObject.nextInt();
        temp = number;
        while(number > 0) {
            modresult = number % 10;
            number = number / 10;
            reverse = reverse * 10 + modresult;
        }
            if(reverse == temp) {
                System.out.println("Palindrome number");
            }
                else {
                    System.out.println("Not a palindrome number");
                }

        System.out.println("Reverse of number is "  + reverse);
        }
    }


