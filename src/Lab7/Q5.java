package Lab7;

import static Lab7.Q4.isPrime;

public class Q5 {

    public static int primeCounter(int num){
        int count = 0;
        for(int i=2; i< num ; i++){
            if (isPrime(i))
                count++;
        } return count;
    }

    public static void main(String[] args) {

        System.out.println(" The no of prime numbers is " + primeCounter(100));
    }
}
