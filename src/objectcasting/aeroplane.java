package objectcasting;

public class aeroplane {
    public static void main(String[] args) {
        takingoff t1 = new landing();
        t1.tyres();
        t1.wings();
        landing l1 = (landing) t1;
        l1.tyres();
        l1.wings1();
    }
}
class takingoff {
    public void tyres() {
        System.out.println("Tyres are hidden while take off");
    }

    public void wings() {
        System.out.println("Wings are visible during take off");
    }
}
class landing extends takingoff {
    public void tyres() {
        System.out.println("Tyres are visible during landing");
    }
    public void wings1() {
        System.out.println("Wings are visible during landing");
    }
}
