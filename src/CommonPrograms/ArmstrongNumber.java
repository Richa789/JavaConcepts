package CommonPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanObj.nextInt();
        int reverse = 0, modresult;
        int temp = number;
        while(number > 0) {
            modresult = number % 10;
            number = number / 10;
            reverse = reverse + (modresult * modresult * modresult);
        }
        if(temp == reverse) {
            System.out.println(temp + " is an armstrong number");
        }
        else {
            System.out.println(temp + " is not an armstrong number");
        }
    }
}
