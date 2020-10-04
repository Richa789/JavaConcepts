package encapsulationdemo;

public class finaluse {
    final static String name = "Monica";
    final int marks = 100;
    public static void main(String[] args) {
        System.out.println(name);
        finaluse f1 = new finaluse();
        System.out.println(f1.marks);
        def d1 = new def();
        d1.user();
    }
}
 class abc {
    final public void user() {

        System.out.println("abc");
    }
}
final class def extends abc {
     public void user1() {

        System.out.println("def");
    }

}
