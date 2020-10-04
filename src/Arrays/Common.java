package Arrays;

public class Common {

    public static void main(String[] args) {

        int array1[] = {2, 33, 45, 11, 76, 89};
        int array2[] = {65, 34, 2, 76, 90, 7, 21, 89, 45};
        for(int i=0;i<array1.length;i++) {
            for(int j=0;j<array2.length;j++) {
                if(array1[i] == array2[j]) {
                    System.out.println("Common numbers are : "+ array1[i]);
                }
            }
        }

    }
}
