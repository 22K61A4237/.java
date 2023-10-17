import java.io.*;
class Animal {
    void eat() {
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    void bark() {
        System.out.println("Dog can bark");
    }
}
class cat extends Animal {
    void meow() {
        System.out.println("cat sounds meow");
    }
}
public class InheritanceDemo3{
    public static void main(String args[]) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}