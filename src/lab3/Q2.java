package lab3;

import java.util.Scanner;

public class Q2<lengthInInch> {

    public static void main(String[] args) {

        // convert input centimeteres into feet and inches

        Scanner input = new Scanner(System.in);

        System.out.println(" Please enter length in centi meters");

        double length = input.nextDouble();

        double totalLengthInInch = length / 2.54;

        int lengthInFeet = (int) (totalLengthInInch / 12);

        double lengthInInch= (totalLengthInInch % 12);



        System.out.println("The length " + length + "cm" + " is equivalent to " + lengthInFeet + " feet &" + lengthInInch + " inches ");


    }

}
