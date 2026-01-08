package Review1;

import java.util.Scanner;

public class Main {
    public static double totalCalculate(double[] scores){
        double total = 0;
        for(int i = 0; i<scores.length; i++){
            total += scores[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"UX/UI", "JAVA", "UX/UI"};
        double[] scores = {80.5,70,100};
        for(int i = 0; i<scores.length; i++){
            System.out.println(subjects[i] + " : " + scores[i]);
        }
        double total = totalCalculate(scores);
        System.out.println("\nTotal score: " + total);

        for(int i = 0; i<scores.length-1; i++){
            for(int j = 0; j<scores.length-1; j++){
                if(scores[j] > scores[j+1]){
                    double temp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp;
                }
            }
        }
        System.out.println("\nAscending Order:");
        for(int i = 0; i<scores.length; i++){
            System.out.println(scores[i]);
        }
    }
}
