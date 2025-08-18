package dsaProblems;

public class ArmstrongNumber {
    public static boolean armstrong(int num){
        int sum = 0; int temp = num;
        while(temp > 0){
            int rem = temp%10;
            sum += rem*rem*rem;
            temp /= 10;
        }
        if (num == sum) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(armstrong(153));
    }
}
