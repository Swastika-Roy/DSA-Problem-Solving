package dsaProblems;

public class palindrome {
    public static void main(String[] args) {
       String str = "madam";
        System.out.println(str.equals(palindrome(str)));
    }
    static String palindrome(String str) {
        char ch[] = str.toCharArray();
        int st = 0;
        int end = ch.length-1;
        while (st < end) {
            char temp = ch[st];
            ch[st] = ch[end];
            ch[end] = temp;
            st++;
            end--;
        }
        return String.valueOf(str);
    }
}
