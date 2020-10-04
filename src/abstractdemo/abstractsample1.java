package abstractdemo;

public class abstractsample1 {
    public static void main(String[] args) {
        BankA b1 = new BankA();
        b1.getbalance();
        BankB b2 = new BankB();
        b2.getbalance();
        BankC b3 = new BankC();
        b3.getbalance();
    }
}
abstract class Bank {
    abstract public void getbalance();
}
class BankA extends Bank {
    public void getbalance() {
        System.out.println("Balance is $100");
    }
}
class BankB extends Bank {
    public void getbalance() {
        System.out.println("Balance is $150");
    }
}
class BankC extends Bank {
    public void getbalance() {
        System.out.println("Balance is $200");
    }
}


