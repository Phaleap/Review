package Review11;

import java.util.Scanner;

class Product{
    String code;
    String name;
    double price;
    public Product(String code, String name, double price){
        this.code = code;
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return code + "\t" + name + "\t" + price + "\n";
    }
}
interface ProductDB{
    void input(Product p[]);
    void output(Product p[]);
}
class MyProduct implements ProductDB{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void input(Product p[]){
        for(int i = 0; i < p.length; i++){
            System.out.println("===== Product("+(i+1) + ")=====");
            System.out.print("Enter your code: ");
            String code = scanner.nextLine();
            System.out.print("Enter your product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            p[i] = new Product(code, name, price);
        }
    }
    @Override
    public void output(Product p[]){
        System.out.println("Code\tName\tPrice");
        for(Product product:p){
            System.out.println(product.toString());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Product[] p = new Product[2];
        MyProduct mp = new MyProduct();
        mp.input(p);
        mp.output(p);
    }
}
