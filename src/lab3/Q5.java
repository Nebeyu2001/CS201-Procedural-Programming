package lab3;


import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" please enter your birth year");

        int birthYear = input.nextInt();

        int currentYear = 2021;

        int age = currentYear - birthYear;

        System.out.println(" You were born in " + birthYear + " you are " + age + " this year.");

    }

}
