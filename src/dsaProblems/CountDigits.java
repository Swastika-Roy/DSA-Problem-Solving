package dsaProblems;

public class CountDigits {
    public static int count(int num){
        int count = String.valueOf(num).length();
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(123));
    }
}

