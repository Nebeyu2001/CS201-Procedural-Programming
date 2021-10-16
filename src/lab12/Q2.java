package lab12;

public class Q2 {

    public static int findMin(int[] arr, int index) {

        int minValue;

        if (index == arr.length - 1)
            return arr[index];
        else
            minValue = findMin(arr, index + 1);

        if (arr[index] < minValue)
            return arr[index];
        else
            return minValue;
    }

    public static void main(String[] args) {
        int [] arr = {1, 4, 45, 6, -50, 10, 2};
        int index = arr.length;


        System.out.println(findMin(arr, 0));
    }
}