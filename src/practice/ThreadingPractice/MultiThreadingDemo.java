package practice.ThreadingPractice;

public class MultiThreadingDemo {
    public static void main(String[] args) {
       Student s1 = new Student();
       Thread t1 = new Thread(s1);
       t1.start();
       Employee e1 = new Employee();
       Thread t2 = new Thread(e1);
       e1.start();
       for(int i=0; i<5; i++) {
           System.out.println("Main class");

       }
    }
}
class Student implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Student class");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Employee extends Animal {
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("We can extend class through runnable interface");
        }
    }
}

