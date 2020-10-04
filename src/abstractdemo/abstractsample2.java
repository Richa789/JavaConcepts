package abstractdemo;

public class abstractsample2 {
    public static void main(String[] args) {
    studentA a1 = new studentA();
    a1.getpercentage();
    studentB b1 = new studentB();
    b1.getpercentage();
    }
}
abstract class marks {
    abstract public void getpercentage();
}
class studentA extends marks {
    int sub1,sub2,sub3;
    public studentA()
    {
     sub1 = 23;
     sub2 = 45;
     sub3 = 56;
    }
    public void getpercentage() {
      System.out.println("Percentage is"+ ((sub1+sub2+sub3)/0.03)+"%");
    }
}

class studentB extends marks {
    int sub4, sub5, sub6, sub7;

    public studentB() {
        sub4 = 76;
        sub5 = 87;
        sub6 = 65;
        sub7 = 98;
    }

    public void getpercentage() {
        System.out.println("Percentage is"+ ((sub4 + sub5 + sub6 + sub7) / 0.03)+"%");
    }
}
