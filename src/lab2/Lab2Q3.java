package lab2;

import java.util.Scanner;

public class Lab2Q3 {

    public static void main(String[]  args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter a word with odd number of characters");

        String word = input.next();

        System.out.println("The middle character is: " + word.charAt(word.length()/2));
    }
}
