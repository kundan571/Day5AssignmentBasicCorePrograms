package basicCoreProgramming;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter The 4 Digit year");
        Scanner Sc =new Scanner(System.in);
        int year = Sc.nextInt();
        if (year < 999){
            System.out.println("invalid input");
            return;
        }
        if (year % 4 == 0){
            System.out.println(year + " Is a leap year:");
        }
        else {
            System.out.println(year + " Is not a leap year:");
        }
    }
}
