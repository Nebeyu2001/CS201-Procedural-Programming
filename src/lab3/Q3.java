package lab3;


import java.util.Scanner;

public class Q3 {

    public static void main(String [] args) {

         Scanner input = new Scanner(System.in);

        System.out.println("please enter temperature in Celsius ");

        double celsius = input.nextDouble();

        double fahrenheit = 1.8 * celsius + 32;

        System.out.println("The temperature in Celsius: " + celsius + " is equivalent to " + fahrenheit + " in fahrenheit" );





    }
}
