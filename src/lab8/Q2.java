package lab8;

import java.util.Scanner;

public class Q2 {

    public static void main(String [] args){


            Scanner input = new Scanner(System.in);
            String  sentence;
            int count=0;


            while(true){
                System.out.println("please enter a string sentence");
                sentence = input.nextLine();

                if (sentence.isEmpty())
                    break;

                for (int i = 0; i < sentence.length(); i++) {

                    if (Character.isUpperCase(sentence.charAt(i)))
                        count++;
                }

                System.out.println("The count of uppercase letters in: (" + sentence + " ) is: " + count);
            }
        }
    }



