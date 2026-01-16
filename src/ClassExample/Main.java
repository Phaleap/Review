package ClassExample;

class Animal{
    String name;
    int age;
    void info(){
        System.out.println("The cat's name is " + name + " and it is 18 years old");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.age = 12;
        animal.name = "Ako";
        animal.info();
    }
}
