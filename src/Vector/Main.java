package Vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vecList = new Vector<>();
        vecList.addElement("Blue");
        vecList.addElement("Yellow");
        vecList.addElement("Red");
        vecList.addElement("Green");
        for(String element:vecList){
            System.out.println(element);
        }
    }
}
