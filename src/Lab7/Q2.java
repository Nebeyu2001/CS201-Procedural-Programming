package Lab7;

import java.sql.SQLOutput;

public class Q2 {



        public static void main(String[] args) {

      // a. 1+2+3+4........+100 using while statement

     int sum = 0;
       int num=1;

       while (num > 0 && num <= 100 ) {
           sum = sum + num;
           num++;
       }
       System.out.println("The sum is: " + sum);


        // Using do while statment
        int sum1 = 0;
        int num1 = 1;
      do {
          sum1 += num1;

          num1++;

        }while ( num1<=100);
      System.out.println("The sum1 is: " + sum1);


      // Using for loop
            int sum2 = 0;
            for(int i = 1; i<=100; i++){
                sum2 = sum2 + i;
            }
            System.out.println("The sum2 is: " + sum2);

      // ==========================================================================

      // b. 5 + 10 + 15 + 20 + 25 .....+50 Using while loop

      int sum3 = 0;
      int num3 = 5;

      while(num3<=50){
          sum3+=num3;
          num3+=5;
      }
            System.out.println(" Sum3 is :" + sum3);

      // Using for loop

            int sum4 = 0;
            for(int num4=5; num4<=50 ; num4+=5){
                sum4+=num4;
            }

            System.out.println(" Sum4 is : " + sum4);
    }
}


