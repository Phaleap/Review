package HashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<String>();
        mySet.add("Apple");
        mySet.add("Kiwi");
        mySet.add(null);
        for(String item:mySet){
            System.out.println(item);
        }
    }
}
