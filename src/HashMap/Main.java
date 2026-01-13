package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 20);
        map.put("B", 12);
        map.put("C", 30);
        map.put("D", 60);
        map.put("E", 50);
//        for(Map.Entry<String, Integer>entry:map.entrySet()){
//            String key = entry.getKey();
//            System.out.println("Key: " + key + ", Value: " + entry.getValue());
//        }
        for(String key:map.keySet()){
            Integer value = map.get(key);
            System.out.print(value + "\t");
        }
    }
}
