package basicCoreProgramming;

import java.util.Scanner;

public class CheckVowelConsonant {
    public static void main(String[] args) {
        // Taking user input
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter An Alphabet: ");
        char alphabet = Sc.next().charAt(0);
        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
            System.out.println("Alphabet is Vowel:");
        }
        else {
            System.out.println("Alphabet is Consonant");
        }
    }
}
