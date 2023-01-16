package Ephrem;
import java.util.Scanner;

public class SameLetter {
    public static boolean sameLetter(String firstWord, String secondWord){
        boolean sameLetter = true;
        for(int i=0; i<secondWord.length(); i++){
            int count = 0;
            for(int j=0; j<firstWord.length(); j++) {
                if (Character.toLowerCase(secondWord.charAt(i)) == Character.toLowerCase(firstWord.charAt(j))) {
                    count++;
                    break;
                }
            }
            if(count == secondWord.length()-1){
                sameLetter = true;
            }else {
                sameLetter = false;
            }
        }
       return sameLetter;
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
String --- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */