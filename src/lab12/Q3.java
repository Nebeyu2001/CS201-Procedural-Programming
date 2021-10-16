package lab12;

public class Q3 {

    public static int sumOfArray(int [] array, int index){


        int sum;
        if (index == array.length-1)
            return array[index];

//        sum = sumOfArray(array,index+1);
//        sum += array[index];
//        return sum;

         return array[index] + sumOfArray(array,index+1);


    }

    public static void main(String[] args) {

            int [] array = {1,4,10, 2};
            int index = array.length;


            System.out.println(sumOfArray(array, 0));
        }
    }

