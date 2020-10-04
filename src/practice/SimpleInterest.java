package practice;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter principal value :");
        int principalvalue = scan.nextInt();
        System.out.println("enter rate value :");
        int ratevalue = scan.nextInt();
        System.out.println("enter time value :");
        int timevalue = scan.nextInt();

        InterestCalculations interestCalculations = new InterestCalculations();
        double compoundInterest = interestCalculations.calculateCompoundInterest(principalvalue, ratevalue, timevalue);
        System.out.println("Compound interest is : "+ compoundInterest);
        double simpleInterest = interestCalculations.calculateSimpleInterest(principalvalue, ratevalue, timevalue);
        System.out.println("Simple interest is : "+ simpleInterest);

        double balance = interestCalculations.balance();

    }
}
