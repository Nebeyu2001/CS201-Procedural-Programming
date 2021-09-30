package lab2;

import java.util.Scanner;

public class Lab2Q2 {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println(" please enter a string ");

        String str = input.nextLine();

        System.out.println(" The number of characters in the string str is: " + str.length());

        System.out.println(" The first character of the string is: " + str.charAt(0));

        System.out.println(" The last character of the string is: " + str.charAt(str.length()-1));

    }
}
