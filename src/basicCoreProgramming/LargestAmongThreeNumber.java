package basicCoreProgramming;

import java.util.Scanner;

public class LargestAmongThreeNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Three Number:");
        int number1 = Sc.nextInt();
        int number2 = Sc.nextInt();
        int number3 = Sc.nextInt();

        if (number1 >= number2 && number1 >= number3){
            System.out.println(number1 + " is the Largest Number:");
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println(number2 + " Is the Largest Numbar:");

        }
        else {
            System.out.println(number3 + " Is the Largest Number:");
        }
    }
}
