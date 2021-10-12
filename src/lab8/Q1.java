package lab8;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args){
        String sentence;
        Scanner input = new Scanner(System.in);
        int counta=0;
        int counte=0;
        int counti=0;
        int counto=0;
        int countu=0;
        do {
            System.out.println(" please enter a sentence");
            sentence = input.nextLine();
            if(sentence.isEmpty())break;
            int i = 0;
            while (i < sentence.length()) {


                if (sentence.charAt(i) == 'a')
                    counta++;
                else if (sentence.charAt(i) == 'e')
                    counte++;
                else if (sentence.charAt(i) == 'i')
                    counti++;
                else if (sentence.charAt(i) == 'o')
                    counto++;
                else if (sentence.charAt(i) == 'u')
                    countu++;

                i++;

            }
            System.out.println("Vowel counts for the sentence");
            System.out.println(sentence);
            System.out.println("# of 'a' : " + counta);
            System.out.println("# of 'e' : " + counte);
            System.out.println("# of 'i': " + counti);
            System.out.println("# of 'o': " + counto);
            System.out.println("# of 'e': " + countu);

        } while(true);


    }
}
