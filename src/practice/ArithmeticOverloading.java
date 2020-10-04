package practice;

public class ArithmeticOverloading {
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add());
        System.out.println(add(2.3f, 20));
    }
    public static int add(int i, int j) {
        int k = i + j;
        return k;
    }
    public static int add() {
        int i = 20;
        int j = 30;
        int k = i + j;
        return k;
    }
    public static float add(float i, int j) {
        float k = i + j;
        return k;
    }
}
