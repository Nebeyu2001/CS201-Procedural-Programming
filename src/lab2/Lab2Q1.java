package lab2;

import java.util.Scanner;

public class Lab2Q1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println(" please enter the first middle and last name");

        String fname = input.next();
        String mname = input.next();
        String lname = input.next();

        System.out.println(fname +" " + mname.charAt(0)+"." + " " + lname);
    }
}
