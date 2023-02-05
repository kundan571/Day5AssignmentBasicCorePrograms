package basicCoreProgramming;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        System.out.println("Enter Dividend and divisor:");
        Scanner Sc = new Scanner(System.in);
        int dividend = Sc.nextInt();
        int divisor = Sc.nextInt();
        double quotient = dividend / divisor;
        double remainder = dividend % divisor;
        System.out.println("The Quotient is: " + quotient);
        System.out.println("The Remainder is: " + remainder);
    }
}
