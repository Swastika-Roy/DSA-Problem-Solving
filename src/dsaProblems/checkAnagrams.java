package dsaProblems;

import java.util.Arrays;

public class checkAnagrams {
    public static boolean Anagram(String str1,String str2){
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }

    public static void main(String[] args) {
        System.out.println(Anagram("silent","listen"));
    }
}
