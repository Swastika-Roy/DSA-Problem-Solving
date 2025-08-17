package dsaProblems;

public class isPrime {
    static boolean isPrime(int n) {
        int count = 0;
        if(n<2) return false;
        for (int i=2;i<n;i++){
            if(n%i==0)count++;
        }
        if(count ==2){
            return true;
        }
        else return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(50));
    }
}





