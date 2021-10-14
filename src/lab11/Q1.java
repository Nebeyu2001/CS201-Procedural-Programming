package lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int num = scanner.nextInt();

            if (num != 0) {
                throw new Exception("Not Zero");
            }

            System.out.println(" I'm happy with the input.");

        } catch (InputMismatchException e)  {

            System.out.println("Invalid Entry");

        } catch (Exception e) {

            System.out.println("Error:" + e.getMessage());
        }
    }
}
 // output

// when the input is -1, the output is: Error:Not Zero
// when the input is 0, the output is: I'm happy with the input.
// when the input is 12xy, the output is: Invalid entry