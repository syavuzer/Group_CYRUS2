package Ephrem;
import java.util.Scanner;

public class SameLetter {
    public static boolean sameLetter(String firstWord, String secondword){
        boolean same = true;
        for(int i=0; i<firstWord.length(); i++){
            int count = 0;
            for(int j=0; j<firstWord.length(); j++) {
                if (firstWord.charAt(i) == secondword.charAt(j)) {
                    count++;
                    break;
                }
            }
            if(count == firstWord.length()-1){
                same = true;
            }
        }
       return same;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        String firstWord = input.next();
        System.out.println("Enter your second word");
        String secondWord = input.next();

        System.out.println(sameLetter(firstWord, secondWord));
    }
}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */