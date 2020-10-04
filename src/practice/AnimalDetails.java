package practice;

public class AnimalDetails {
    public static void main(String[] args) {
       Cat catObject = new Cat();
       catObject.eat();
       catObject.sound();
       catObject.bark();
    }
}
class Horse {
    public void eat() {
        System.out.println("Horse eats grass");
    }
}
class Doggy extends Horse {
    public void bark() {
        System.out.println("Dog barks");
    }
}
class Cat extends Doggy {
    public void sound() {
        System.out.println("Meow Meow");
    }
}
