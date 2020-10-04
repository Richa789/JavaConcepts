package Arrays;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        int numbers[] = {22, 33, 99, 3, 10, 77, 11, 88};
        int max = 0;
        int secondmax = 0;
        int min = numbers[0];
        int secondmin = numbers[0];
        int temp;
        for(int i=0;i<numbers.length;i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
            System.out.println("Greatest number is " + max);

        for(int i=1;i<numbers.length;i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Lowest number is " + min);

        for(int i=0;i<numbers.length;i++) {
            if (numbers[i] > max) {
                secondmax = max;
                max = numbers[i];
            } else if (numbers[i] < max && numbers[i] > secondmax) {
                secondmax = numbers[i];
            }
        }
        System.out.println("Second greatest number is " + secondmax);

        for(int i=0;i<numbers.length;i++) {
            if( min > numbers[i]) {
                min = numbers[i];
                secondmin = min;
            } else if (numbers[i]>min && numbers[i]<secondmin) {
                secondmin = numbers[i];
            }
        }
        System.out.println("Second lowest number is " + secondmin);
    }
}
