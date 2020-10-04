package practice.ExceptionHandling;

public class ArithmeticException {
    public ArithmeticException(int age) {
        if (age<0) {
            throw new java.lang.ArithmeticException("Invalid number");
        }
        else {
            System.out.println("Valid number");
        }
    }

    public static void main(String[] args) {
        ArithmeticException exceptionObject = new ArithmeticException(-1);

    }

}