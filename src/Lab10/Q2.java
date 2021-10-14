package Lab10;

import java.util.Scanner;

public class Q2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("please enter the length of array");
            int N = input.nextInt();

            double [] array = new double[N];
            System.out.println("please enter the elements");
            for(int i = 0; i<array.length; i++){
                array[i]=input.nextInt();
            }
            double sum = 0.0;
            double sDeviation = 0.0;

            int length = array.length;

            for(double num : array) {
                sum += num;
            }
            double mean = sum/length;

            for(double num: array) {
                sDeviation += Math.pow(num - mean, 2);
            }
            System.out.println(Math.sqrt(sDeviation/length));
        }
    }

