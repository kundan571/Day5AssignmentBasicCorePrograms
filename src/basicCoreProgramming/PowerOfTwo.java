package basicCoreProgramming;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter a Number In the range of: 0 <= Number < 31");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt(); // n is the number of power
        int i = 0;
        // ith power of 2
        int power_of_two = 1;
        while (i <= n){
            System.out.println(i + " " + power_of_two);
            power_of_two = 2 * power_of_two;
            i++;
        }
    }
}
