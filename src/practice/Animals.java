package practice;

public class Animals {
    public static void main(String[] args) {
        Dog dogObject = new Dog();
        dogObject.bark();
        dogObject.eat();
    }

}
class Animal {
    public void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog bark");
    }
}
