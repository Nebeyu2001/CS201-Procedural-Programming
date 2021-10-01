package lab3;

import java.util.Scanner;

public class Q1 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter A, B and C as doubles");

        double A = input.nextDouble();

        double B = input.nextDouble();

        double C =  input.nextDouble();

        double solution = Math.sqrt(Math.pow(B,2)) + 4 * A * C;

        System.out.println("The solution for Q1A is : " + solution );


        // Question number 1 b, I just initialize the specific values
        int X = 5;

        int Y = 2;

        System.out.println("The solution for Q1b is :" + ( X + 4 * Math.pow(Y,3)));

        // Question number 1 C

        System.out.println("The solution for Q1C is: " + (Math.cbrt(X*Y)));

        // Question number 1 D

        int R = 2;

        System.out.println("The are of a circle is: "+ Math.PI * Math.pow(R,2));





    }
}
