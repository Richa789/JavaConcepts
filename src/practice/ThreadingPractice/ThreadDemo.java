package practice.ThreadingPractice;

public class ThreadDemo {
    public static void main(String[] args) {
    Animal a1 = new Animal();
    a1.start();
    Human h1 = new Human();
    h1.start();
    for(int i=0; i<=5; i++) {
        System.out.println("Printer 1");
    }
    }
}
class Animal extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Animal 1");
        }
    }
}
class Human extends Thread {
    @Override
    public void run() {
        for(int i=0; i<=5; i++) {
            System.out.println("Human 1");
        }
    }
}



