package practice;

public class Area {
    public static void main(String[] args) {
        System.out.println("area of triangle is " + triangle(30, 40));
        System.out.println("area of rectangle is " + rectangle(20, 30));
        System.out.println("area of circle is " + circle(5));
    }
    public static double triangle(int i, int j) {
        double k = 0.5 * i *j;
        return k;
    }
    public static int rectangle(int l, int b) {
        int k = l * b;
        return k;
    }
    public static float circle(float r) {
        float k = 3.14f * r * r;
        return k;
    }
}

