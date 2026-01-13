package Review8;

import java.util.HashMap;

class Book{
    int code;
    String title;
    double price;
    String author;
    public Book(int code, String title, double price, String author){
        this.code = code;
        this.title = title;
        this.price = price;
        this.author = author;
    }
    @Override
    public String toString(){
        return "Code: " + code + ", Titlte: " + title + ", Price: " + price + ", Author: " + author;
    }
}
public class Main {
    public static void main(String[] args){
        HashMap<Integer, Book> bookMap = new HashMap<Integer, Book>();
        bookMap.put(1, new Book(1, "Metamorphosis", 12.5f, "Kafka"));
        bookMap.put(2, new Book(2, "The trail", 12.5f, "Kafka"));
        bookMap.put(3, new Book(3, "The castle", 12.5f, "Kafka"));
        bookMap.put(4, new Book(4, "Amerika", 12.5f, "Kafka"));
        for(Integer key:bookMap.keySet()){
            Book value = bookMap.get(key);
            System.out.println(value);
        }

    }
}
