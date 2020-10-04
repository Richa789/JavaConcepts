package practice.DecisionMaking;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        int value = perimeter(12, 14);
        System.out.println("The perimeter of rectangle is " + value);
    }
    public static int perimeter(int length, int height) {
        return 2*(length + height);
    }
}
