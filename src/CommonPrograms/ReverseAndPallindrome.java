package CommonPrograms;

import java.util.Scanner;

public class ReverseAndPallindrome {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanObj.nextInt();
        int reverse = 0, modresult;
        int temp = number;
        while (number > 0) {
            modresult = number % 10;
            number = number / 10;
            reverse = reverse * 10 + modresult;
        }
        System.out.println("Reverse of given number is " + reverse);
        if(temp == reverse) {
            System.out.println(temp + " is a pallindrome number");
        }
        else {
            System.out.println(temp + " is not a pallindrome number");
        }
    }
}



