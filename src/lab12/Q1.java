package lab12;

public class Q1 {

    public static int countLength(String str){

        if (str.equals(""))
                return 0;
        else
            return (1 + countLength(str.substring(1)));

    }

    public static void main(String[] args) {
       System.out.println(countLength("nebeyu"));
    }
}

