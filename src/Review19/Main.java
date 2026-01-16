package Review19;

class Employee{
    public double calculateSalary(){
        return 0;
    }
}
class FullTimeEmployee extends Employee{
    double salary;

    FullTimeEmployee(double salary){
        this.salary = salary;
    }
    @Override
    public double calculateSalary(){
        return salary;
    }
}
class PartTimeEmployee extends Employee{
    double hours;
    double rate;
    PartTimeEmployee(double hours, double rate){
        this.hours = hours;
        this.rate = rate;
    }
    @Override
    public double calculateSalary(){
        return hours * rate;
    }
}
class Intern extends Employee{
    @Override
    public double calculateSalary(){
        return 300;
    }
}
public class Main {
    public static void main(String[] args){
        Employee[] emp = {
                new FullTimeEmployee(300),
                new PartTimeEmployee(10,20),
                new Intern()
        };
        double max = 0;
        for(Employee e:emp){
            double s = e.calculateSalary();
            System.out.println(s);
            if ( s > max) max = s;
        }
        System.out.println("Highest salary= " + max);
    }
}
