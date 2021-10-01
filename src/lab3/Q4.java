package lab3;

import java.util.Scanner;

public class Q4 {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println(" please enter a person's weight in pounds");

        double bodyWeight = input.nextDouble();

        double calories = bodyWeight * 19;

        System.out.println(" A person who has a body weight of " + bodyWeight + " pounds need " + calories + " calories per day");
    }
}
