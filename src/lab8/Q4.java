package lab8;


import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);




        while (true) {

            String answer = "is palindrome";
            System.out.println(" please enter a string");
            String str = input.nextLine();
            str = str.toLowerCase();

            if (str.isEmpty()) {

                break;
            }
            for (int i = 0, j = str.length() - 1; i < j; i++) {

                if (str.charAt(i) != str.charAt(j)) {
                    answer = " is not palindrome";
                    break;

                }


                j--;


            }


            System.out.println(answer);


        }

    }

}