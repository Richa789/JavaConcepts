package abstractdemo;

public class interfacesample {
    public static void main(String[] args) {
      sbi2 s1 = new sbi2();
      s1.deposit();
      s1.withdrawl();
      s1.minbal();
    }
}
interface rbi {
    void deposit();
    void withdrawl();
    void minbal();
}
abstract class sbi implements rbi {
    public void deposit() {
        System.out.println("deposit in sbi");
    }
    public void withdrawl() {
        System.out.println("withdraw from sbi");
    }
}
class sbi2 extends sbi {
    public void minbal() {
        System.out.println("minimum balance should be Rs.1000/-");
    }
}
