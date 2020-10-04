package Arrays;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int temp;
        int[] numbers = {12, 43, 2, -7, 98, 3};
        for(int i=0;i<numbers.length;i++) {
            for(int j=0;j<numbers.length-1;j++) {
                if(numbers[j] > numbers[j+1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        for(int k=0; k<numbers.length ; k++) {
            System.out.println(numbers[k]);
        }

    }
}
