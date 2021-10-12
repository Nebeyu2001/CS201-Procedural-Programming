package lab8;



import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" please enter the DNA strand");

        String strandDna = input.nextLine();
        strandDna = strandDna.toUpperCase();

        String complementStrand="";

        while(!strandDna.trim().equals("")){

            if (strandDna.isEmpty())
                break;

            for(int i=0; i < strandDna.length();i++){

                if(strandDna.charAt(i) == 'A'){

                    complementStrand = complementStrand + "T";

                }
                else if (strandDna.charAt(i) == 'T'){
                    complementStrand = complementStrand + "A";
                }
                else if (strandDna.charAt(i) == 'C'){
                    complementStrand = complementStrand + "G";
                }
                else if (strandDna.charAt(i) == 'G'){
                    complementStrand = complementStrand + "C";
                }





            }

            System.out.println(" please input empty string to exit");
            strandDna = input.nextLine();
            break;




        }



        System.out.println(complementStrand);






    }
}
