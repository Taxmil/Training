package Week3task;
import java.util.*;
public class StringManipulation {
    public static boolean isPalindrome(String str) {
        String ogstr;
        ogstr = str.toLowerCase();
        if (str.equals(ogstr)) {
            return true;
        } else {
            System.out.println("it is not an pallindrome");
            return false;
        }
    }
    public static String sortWords(String input){
        if (input==null){
            return  null;
        }
        String[] words=input.trim().split(" ");
        Arrays.sort(words);
        return String.join(".",words);

    }


    public static void main(String[] args) {
        String Result;
//        boolean result = false;
//        result = StringManipulation.isPalindrome("racsecar");
//        if (result) {
//            System.out.println("it is an palindrome");
//        } else {
//            System.out.println("it is not a palindrome");
//        }
        Result=sortWords("banana apple orange");
        System.out.println(Result);


    }
}



