package ArrayListReview;


import java.util.ArrayList;

class Student{
    String name;
    int id;
    double score;
    public Student(int id,String name, double score){

        this.id = id;
        this.name = name;
        this.score = score;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Score: " + score;
    }


}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Dostoevsky", 90.0f));
        students.add(new Student(4, "Nastenka", 80.5f));
        students.add(new Student(6, "Rodya", 60.0f));
        students.add(new Student(2, "Razumikhin", 70.0f));
        students.add(new Student(3, "Raskolnakov", 70.5f));


        //Descending
        for(int i = 0; i < students.size() -1; i++) {
            for(int j = 0; j < students.size() -1; j++){
                if(students.get(j+1).id < students.get(j).id){
                    Student temp = students.get(j);
                    students.set(j, students.get(j+1));
                    students.set(j+1, temp);
                }
            }
        }
        for(Student student:students){
            System.out.println(student.toString());
        }

    }
}
