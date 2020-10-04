package CommonPrograms;

public class Factorial {
    public static void main(String[] args) {
        int prod = 1;
        for(int i = 5; i >= 1; i--) {
            prod = prod * i;
        }
        System.out.println(prod);
    }
}
