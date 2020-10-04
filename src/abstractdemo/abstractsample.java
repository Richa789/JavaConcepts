package abstractdemo;

public class abstractsample {
    public static void main(String[] args) {
        A p1 = new A();
        p1.message();
        B p2 = new B();
        p2.message();
    }
}
abstract class parent {
     public void message() {

     }
}
 class A extends parent {
    public void message() {
        System.out.println("This is first subclass");
    }
}
class B extends parent {
    public void message() {
        System.out.println("This is second subclass");
    }
}
