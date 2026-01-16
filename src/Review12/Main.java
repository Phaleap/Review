package Review12;

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
    public String toString(){
        return "Code: " + code + ", Title: " + title + ", Price: " + price;
    }
}
public class Main {
    public static void main(String[] args){
        HashMap<Integer, Book> dataList = new HashMap<Integer, Book>();
        dataList.put(1, new Book(3301, "The war of art", 12));
        dataList.put(2, new Book(3302, "The art of seduction", 11));
        dataList.put(3, new Book(3303, "The laws of human nature", 15));
        //display
        for(Integer key : dataList.keySet()){
            Book value = dataList.get(key);
            System.out.println(value);
        }

    }
}
