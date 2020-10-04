package practice.DecisionMaking;

public class MaxEdgeOfTriangle {
    public static void main(String[] args) {
        int range = sides(3, 4);
        System.out.println("The maximum range of triangle is " + range);
    }
    public static int sides(int side1, int side2) {
        return (side1+side2)-1;
    }
}
