package Lab7;

import java.util.Scanner;

public class Q4 {

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }


        }
        return true;
    }
//
//      public static int primeCounter1(int num){
//       int count1 = 0 ;
//       for(int i=2; i < num; i++){
//
//           for(int j=1; j < i; j++){
//                if(i%j==0){
//                   count1++;
//                }
//         }
///       return count1;
//       }
////    }
  //
    public static int primeCounter(int num){
        int count = 0;
        for(int i=2; i< num ; i++){
            if (isPrime(i))
                count++;
        } return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(" Please enter number");
            int num = input.nextInt();
            if (num < 0)
                break;


            if (isPrime(num)) {
                System.out.println(num + " is a prime number");


            } else {
                System.out.println(num + " is not a prime number");

            }


        }

        System.out.println("number of prime no:" + primeCounter(10));


    }
}