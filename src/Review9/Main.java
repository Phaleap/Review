package Review9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("White");
        colors.add("black");
        for(String color: colors){
            System.out.println(color);
        }
        //c
        System.out.println("===========");
        colors.add(0, "Purple");
        for(String color: colors){
            System.out.println(color);
        }
        //d
        System.out.println("===========");
        String getColor = colors.get(1);
        System.out.println(getColor);
        //e
        System.out.println("===========");
        colors.set(2, "Golden");
        for(String color: colors){
            System.out.println(color);
        }
        //f
        System.out.println("============");
        colors.remove(1);
        for(String color: colors){
            System.out.println(color);
        }
        //g
        System.out.println("=============");
        String findColor = "Golden";
        if(colors.contains(findColor)){
            System.out.println(findColor + " is found in array!");
        }
        else{
            System.out.println(findColor + " is not found!");
        }


    }
}
