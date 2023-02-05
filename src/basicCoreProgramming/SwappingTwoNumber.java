package basicCoreProgramming;

import java.util.Scanner;

public class SwappingTwoNumber {
    public static void main(String[] args) {
        // initialisation
        int x;
        int y;
        int temp;
        // Taking User Input
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The Value Of X And Y");
        x = Sc.nextInt();
        y = Sc.nextInt();
        // Swapping logic
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swaping: " + x + " , " + y);


    }
}
