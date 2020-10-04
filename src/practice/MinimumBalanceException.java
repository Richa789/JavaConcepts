package practice;

import java.util.Scanner;

public class MinimumBalanceException extends RuntimeException {
    public MinimumBalanceException(String message) {
        super(message);
    }
}
class User {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount deposited :");
        double depositInput = scan.nextDouble();
        System.out.println("Enter the amount withdrawn :");
        int withdrawInput = scan.nextInt();
        if(withdrawInput > depositInput || withdrawInput == depositInput) {
            throw new MinimumBalanceException("Amount5 exceeds because current balance is " + depositInput);
        }
        else
        {
            System.out.println("Collect your amount");
        }
    }
}
