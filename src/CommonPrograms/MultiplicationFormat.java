package CommonPrograms;

public class MultiplicationFormat {
    public static void main(String[] args) {
        int number = 5;
        int prod = 1;
        for(int i = 1; i <= 5; i++) {
            prod = number * i;
            System.out.println(number + "*" + i + "=" + prod);
        }
    }
}
