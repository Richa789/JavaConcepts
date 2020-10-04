package practice;
import java.util.*;

public class ScannerArithmetic {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("enter integer input : ");
        int userInput = scannerObject.nextInt();
        System.out.println("enter float input : ");
        float floatInput = scannerObject.nextFloat();
        System.out.println("addition value is" +(userInput+floatInput));
        System.out.println("subtraction value is "+(userInput-floatInput));
        System.out.println("multiplication value is "+(userInput*floatInput));
        System.out.println("division value is "+(userInput/floatInput));
        System.out.println("modulus value is "+(userInput%floatInput));
    }
}
