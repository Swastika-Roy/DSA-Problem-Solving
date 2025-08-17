package dsaProblems;

public class ReverseEachWordInAString {
    public static void Reverse(String str){
       String[] ch = str.split(" ");
       StringBuilder ans = new StringBuilder();

       for (String word : ch){
           for (int i = word.length()-1; i >= 0; i--){
               ans.append(word.charAt(i));
           }
           ans.append(" ");
       }
        System.out.println(ans.toString().trim());
    }

    public static void main(String[] args) {
        Reverse("Java is a good programming langauage");
    }
}
