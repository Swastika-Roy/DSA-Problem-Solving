package dsaProblems;

public class ReverseNum {

    public static void Rev(int num){
        int sum = 0; int temp = num;
        while(temp != 0){
            int rem = temp % 10;
            sum = sum*10 + rem;
            temp /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Rev(123);
    }
}

