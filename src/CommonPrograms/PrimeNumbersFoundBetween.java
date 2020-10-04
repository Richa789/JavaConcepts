package CommonPrograms;

import java.util.Scanner;

public class PrimeNumbersFoundBetween {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanObj.nextInt();
        for(int i = 1; i <= number; i++) {
            boolean status = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    status = false;
                    break;
                }
            }
            if(status == true) {
                System.out.println(i);
            }
        }
    }
}
