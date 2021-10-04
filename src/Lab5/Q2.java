package Lab5;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args){
         final double hourlyWage = 7.25;
         final double overTimeWage = 10.875;
         final double regularHours = 40;
         double wage;


         Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of hours worked");
        double numberOfHours = input.nextDouble();
        System.out.println("please enter the sales volume");
        double salesVolume = input.nextDouble();

        if(salesVolume < 100){
            if(numberOfHours <= regularHours) {
                wage = ((numberOfHours * hourlyWage) + (0.05 * salesVolume));
                System.out.println(wage);
            }else {
                wage = ((regularHours * hourlyWage) + (numberOfHours - regularHours) * overTimeWage + (0.05 * salesVolume));
                System.out.println(wage);
            }

        } else if (salesVolume>=100 && salesVolume<300) {
            if (numberOfHours <= regularHours) {
                wage = ((numberOfHours * hourlyWage) + (0.10 * salesVolume));
                System.out.println("wage = " + wage);

            }else {
                wage = ((regularHours * hourlyWage) + (numberOfHours - regularHours) * overTimeWage + (0.10 * salesVolume));
                System.out.println("wage = " + wage);
            }
        } else if(salesVolume >=300){
            if (numberOfHours <= regularHours) {
                wage = ((numberOfHours * hourlyWage) + (0.15 * salesVolume));
                System.out.println("wage = " + wage);
            }
            else {
                wage = ((regularHours * hourlyWage) + (numberOfHours - regularHours) * overTimeWage + (0.15 * salesVolume));
                System.out.println("wage = " + wage);
            }
        } else {
            System.out.println("please input positive floating number for number of hours and sales volume ");
        }
    }
}
