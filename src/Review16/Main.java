package Review16;

import java.util.Scanner;

class Person{
    String name;
    int age;
    String country;
    Person(String name, int age, String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }
    void showInfo(){
        System.out.println("Name: " + name + ", Age: " + age + ", Country: " + country);
    }
}
class Student extends Person{
    String classLearning;
    int id;
     Student(String name, int age, String country, String classLearning, int id){
        super(name, age,country);
        this.classLearning = classLearning;
        this.id = id;
    }
    @Override
    void showInfo(){
        System.out.println("Name: " + name + ", Age: " + age + ", Country: " + country + ",Class: " + classLearning + ", ID: " + id);
    }

}
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your country: ");
        String country = scanner.nextLine();
        System.out.print("Enter your class: ");
        String classLearn = scanner.nextLine();
        System.out.print("Enter your ID: ");
        int id = scanner.nextInt();
        Student student = new Student(name,age,country,classLearn,id);
        student.showInfo();

    }
}
