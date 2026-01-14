package Review10;

import java.util.ArrayList;

class Student{
    int id;
    String name;
    double score;
    int age;
    public Student(int id, String name, double score, int age){
        this.id = id;
        this.name = name;
        this.score = score;
        this.age = age;
    }
    @Override
    public String toString(){
        return "ID: " + id + ", Name: " + name + ", Score: " + score + ", Age: " + age;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentArray = new ArrayList<Student>();
        studentArray.add(new Student(1, "Phaleap", 80.5f, 12));
        studentArray.add(new Student(5, "Lucy", 81.5f, 12));
        studentArray.add(new Student(2, "Peter", 90.5f, 12));
        studentArray.add(new Student(3, "Parker", 70.5f, 12));
        for(Student stu:studentArray){
            System.out.println(stu);
        }
        System.out.println("==============");
        //Descending by score
        for(int i = 0; i < studentArray.size() -1; i++){
            for(int j = 0; j <studentArray.size() -1; j++){
                if(studentArray.get(j+1).score > studentArray.get(j).score){
                    Student temp = studentArray.get(j);
                    studentArray.set(j, studentArray.get(j+1));
                    studentArray.set(j+1, temp);
                }
            }
        }
        for(Student stu:studentArray){
            System.out.println(stu);
        }
        //Find a student
        System.out.println("=================");
        String findStudent = "Kaka";
        boolean found = false;
        for(Student student:studentArray){
            if(student.name.equals(findStudent)){
                System.out.println(findStudent + " is found");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(findStudent + " is not found");
        }


    }
}
