package lab11;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;

public class exceptionExercise {



    public static class exceptionExcerise extends Throwable{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double num = sc.nextDouble();
            double x = 0.0;
            double result;

            try {

                if (num == 0)
                    throw new ArithmeticException("Division by Zero");
                else if(num>100)
                    throw new IndexOutOfBoundsException("index more than subscript 100 exception");
                else
                    result = x / num;
                System.out.println("I am happy with the input" + " result= " + result);

            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            catch(IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }

            catch (Exception e) {
                System.out.println("Error:" + e.getMessage());
            }
            //graceful termination
            finally {
                System.out.println(" this is a final statment");
            }


        }
    }


}
