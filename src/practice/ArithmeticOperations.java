package practice;

public class ArithmeticOperations {
    public static void mod(int i, int j) {
        System.out.println("modulus value is " + (i % j));
    }
    public static void main(String[] args) {
        add(100,200);
        sub(400,300);
        multi(200,400);
        div(500,200);
        mod(300,700);
    }
    public static void add(int i, int j) {
        System.out.println("addition value is "+ (i+j));
    }
    public static void sub(int i, int j) {
        System.out.println("subtraction value is "+ (i-j));
    }
    public static void multi(int i, int j) {
        System.out.println("multiplication value is "+ (i*j));
    }
    public static void div(int i, int j) {
        System.out.println("division value is "+ (i/j));
    }
}

