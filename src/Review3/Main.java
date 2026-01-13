package Review3;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    public String name;
    public int age;
    public double score;
    public Student(String name, int age, double score){
        this.name= name;
        this.age = age;
        this.score = score;
    }
    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age +", Score: " + score;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<Student>();
        studentsList.add(new Student("Ambatukam", 20, 90.5));
        studentsList.add(new Student("Lisa", 20, 80.5));
        studentsList.add(new Student("Ana", 20, 81.5));
        studentsList.add(new Student("Meta", 20, 72.5));
        studentsList.add(new Student("John", 20, 66.5));
        //a-Display
        System.out.println("===== Student's Information =====");
        for(int i = 0; i < studentsList.size(); i++){
            System.out.println("== Student("+(i+1)+"): ");
            System.out.println(studentsList.get(i));
        }
        //2
        System.out.println("================");
        studentsList.add(0,new Student("Katana", 19, 87.5));
        for(Student student:studentsList){
            System.out.println(student);
        }
        //3-get
        System.out.println("============");
        Student getStudent = studentsList.get(1);
        System.out.println(getStudent);
        //4-update
        System.out.println("===========");
        studentsList.set(2, new Student("Hamsa", 22, 80.99));
        for(Student student:studentsList){
            System.out.println(student);
        }
        //5-remove
        System.out.println("===========");
        studentsList.remove(1);
        for(Student student:studentsList){
            System.out.println(student);
        }
        //6-Search
        System.out.println("============");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to find someone?(y/n): ");
        String answer = scanner.nextLine();
        if(answer.equals("y")){
            System.out.print("Type name: ");
            String name = scanner.nextLine();
            boolean found = false;
            for(Student student:studentsList){
                if(student.name.equals(name)){
                    System.out.println("Found: "+ student);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Student's information not exist!");
            }
        }
        else if(answer.equals("n")){
            System.out.println("Bye bye!");
        }
        else{
            System.out.println("What the heck!");
        }

    }
}
