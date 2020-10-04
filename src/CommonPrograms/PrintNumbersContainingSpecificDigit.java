package CommonPrograms;

public class PrintNumbersContainingSpecificDigit {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i % 10 == 7 || i / 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
