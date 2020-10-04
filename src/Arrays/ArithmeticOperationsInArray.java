package Arrays;

public class ArithmeticOperationsInArray {

    public static void main(String[] args) {

        int numbers[] = {2, 3, 5, 7, 8};
        System.out.println(numbers[1]);

        System.out.println("-------");

        int sum = 0;
        for(int i=0;i<numbers.length;i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum of arrays is " + sum);

        System.out.println("-------");

        int product = 1;
        for(int i=0;i<numbers.length;i++) {
            product = product * numbers[i];
        }
        System.out.println("Product of arrays is " + product);

        System.out.println("------");

        int average = 0;
        average = sum/numbers.length;
        System.out.println("Average of arrays is " + average);

        System.out.println("------");

        for(int i=numbers.length-1;i>=0;i--) {
            System.out.println("Reverse of given array is :  " + numbers[i]);
        }

    }
}
