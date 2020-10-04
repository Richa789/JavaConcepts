package practice.ExceptionHandling;

public class UsingParse {
    public static void main(String[] args) {
        String s = "123";
        String s1 = "245.786";
        int i = Integer.parseInt(s);
        double d = Double.parseDouble(s1);
        System.out.println("Value of i : " + i);
        System.out.println("Value of d : "+ d);
        System.out.println("Addition value is "+ (i+d));
    }
}
