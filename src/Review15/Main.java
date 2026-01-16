package Review15;

class Animal{
    String name;
    int age;
    void makeSound(){
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.print("Woof!");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meow!");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
