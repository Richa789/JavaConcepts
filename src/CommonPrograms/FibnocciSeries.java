package CommonPrograms;

public class FibnocciSeries {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 1, thirdNumber;
        System.out.println(firstNumber + " ");
        System.out.println(secondNumber + " ");
        for(int i = 1; i <= 10; i++) {
            thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            System.out.println(thirdNumber + " ");
        }
    }
}
