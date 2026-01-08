package Review2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //a
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red");
        //b
        for(String color: colors){
            System.out.println(color);
        }
        //c
        System.out.println("========");
        colors.add(0, "Gold");
        for(String color: colors){
            System.out.println(color);
        }
        //d
        System.out.println("========");
        colors.get(1);
        String getColor = colors.get(1);
        System.out.println(getColor);
        //e
        System.out.println("=========");
        colors.set(1, "purple");
        for(String color:colors){
            System.out.println(color);
        }
        //f
        System.out.println("=======");
        colors.remove(1);
        for(String color: colors){
            System.out.println(color);
        }
        //g
        System.out.println("========");
        String searchColor = "Purple";
        if(colors.contains(searchColor)){
            System.out.println(searchColor + " exist");
        }
        else{
            System.out.println(searchColor + " doesn't exist");
        }
    }
}
