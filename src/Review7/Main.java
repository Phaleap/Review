package Review7;

import java.util.HashMap;

class Book{
    int code;
    String title;
    double price;
    public Book(int code, String title, double price){
        this.code = code;
        this.title = title;
        this.price = price;
    }
    @Override
    public String toString(){
        return "Code: " + code + ", Tittle: " + title + ", Price: " + price;
    }
}
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Book> bookMap = new HashMap<Integer, Book>();
        bookMap.put(1, new Book(1, "Crime and Punishment", 16.5f));
        bookMap.put(2, new Book(2, "Animal Farm", 20.5f));
        bookMap.put(3, new Book(3, "The daily laws", 17.5f));

        for (Integer key : bookMap.keySet()) {
            Book value = bookMap.get(key);
            System.out.println(value);
        }
    }

}
