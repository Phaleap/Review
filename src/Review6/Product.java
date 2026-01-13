package Review6;

public class Product {
    String code;
    String name;
    double price;
    Product(String c, String n, double p){
        code = c;
        name = n;
        price = p;
    }
    public String toString(){
        return code + "\t" + name + "\t" + price + "\n";
    }
}
