package abstractdemo;

public class multiinterface {
    public static void main(String[] args) {
       C c1 = new C();
       c1.m1();
       c1.m2();
    }
}
interface A1
{
    void m1();
}
interface B1
{
    void m2();
}
class C implements A1,B1 {
    public void m1() {
        System.out.println("m1 method");
    }
    public void m2() {
        System.out.println("m2 method");
    }
}
