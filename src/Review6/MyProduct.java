package Review6;

import java.util.Scanner;

public class MyProduct implements ProductDB{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void input(Product p[]){
        for(int i = 0; i < p.length; i++){
            System.out.println("===Product("+(i+1)+")===");
            System.out.print("Enter your product code: ");
            String code = scanner.nextLine();
            System.out.print("Enter your product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your product price: ");
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
