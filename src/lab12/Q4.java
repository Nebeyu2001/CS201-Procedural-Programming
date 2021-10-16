package lab12;

public class Q4 {

    public static String reverseString(String str ){

        if(str.isEmpty())
            return "";
        return reverseString(str.substring(1))+ str.charAt(0);
    }

    public static void main(String[] args) {

        System.out.println(reverseString("halu"));
    }
}
