package abstractdemo;

public class intefacedef {
    public static void main(String[] args) {
    sbi11 s1 = new sbi11();
    s1.deposit();s1.withdrawl();s1.minbal();
    axis a1 = new axis();
    a1.deposit();a1.withdrawl();a1.minbal();
    }
}
interface rbi1 {
    void deposit();
    void withdrawl();
    public default void minbal() {
        System.out.println("minbal should be Rs.1000/-");
    }
    }
class sbi11 implements rbi1 {
    public void deposit() {
        System.out.println("deposit in sbi");
    }
    public void withdrawl() {
        System.out.println("withdraw from sbi");
    }
    public void minbal() {
        System.out.println("minbal should be Rs.1500/-");
    }
}
class axis implements rbi1 {
    public void deposit() {
        System.out.println("deposit in axis");
    }
    public void withdrawl() {
        System.out.println("withdraw from axis");
    }
}

