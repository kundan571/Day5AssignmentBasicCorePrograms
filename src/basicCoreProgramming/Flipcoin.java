package basicCoreProgramming;

import java.util.Scanner;

public class Flipcoin {
    public static void main(String[] args) {
        // Initialisation
        int head_count = 0;
        int tail_count = 0;
        double heads_percentage;
        double tails_percentage;
        // Input data
        System.out.println("Enter the number of times you want to flip your coin");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt(); // n = number of flips
        //Computation
        for (int i = 0; i < n; i++){
            double random =Math.random();
            if (random < 0.5)
                tail_count++;
            else
                head_count++;
        }
        heads_percentage = (double) head_count / n * 100;
        tails_percentage = (double) tail_count / n * 100;
        System.out.println("percentage of Heads: " + heads_percentage +"%");
        System.out.println("Percentage of Tails: " + tails_percentage +"%");
    }
}
