package lab11;

public class recurrsionquiz {

    public static int minArr(int A[], int n) {

        if (n == 1)
            return A[0];


        return Math.min(A[n - 1], minArr(A, n - 1));
    }


    public static void main(String[] args) {

            int A[] = {1, 4, 45, 6, -50, 10, 2};
            int n = A.length;
            int [] arr = {1, 4, 45, 6, -50, 10, 2};
            int index = arr.length;

            // Function calling
            System.out.println(minArr(A, n));
            System.out.println(findMin(arr, 0));
        }


        // Or

        public static int findMin ( int[] arr, int index){

            int nextVal;

            if (index == arr.length - 1)
                return arr[index];
            else
                nextVal = findMin(arr, index + 1);

            if (arr[index] < nextVal)
                return arr[index];
            else
                return nextVal;


        }
    }
