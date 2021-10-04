package Lab5;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("please enter some integers");
        int n = input.nextInt();
        if(n==6) {
            System.out.println("Ten the power of " + n + " is " + " million");
        }
        else if(n==9){
            System.out.println("Ten the power of " + n + " is" + "billion" );
        }

        else if(n==12){
            System.out.println("Ten the power of " + n + " is" + "Trillion" );
        }

        else if(n==15){
            System.out.println("Ten the power of " + n + " is" + "Quadrillion" );
        }

        else if(n==18){
            System.out.println("Ten the power of " + n + " is" + "Quintillion" );

        }
        else if(n==21){
            System.out.println("Ten the power of " + n + " is" + "Sextillion" );
        }

        else if(n==30){
            System.out.println("Ten the power of " + n + " is" + "Nonillion" );
        }
        else if(n==100){
            System.out.println("Ten the power of " + n + " is" + "Googol" );
        }
        else {
            System.out.println(" I don`t know, please enter 6,9,12,15,18,21,30,100");
        }
    }
}
