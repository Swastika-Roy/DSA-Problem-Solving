package dsaProblems;

public class PrimeNumInRange {
    public static void main(String[] args) {
        PrimeInRange(1,100);
    }
    public static void PrimeInRange(int st,int end){
        for (int num = st; num <= end; num++){
            boolean isPrime = true;
            for (int i=2; i < Math.sqrt(num) ; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1){
                System.out.print(num+" ");
            }
        }
    }
}
