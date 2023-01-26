package Ephrem;
import java.util.Scanner;

public class SameLetter {
    public static boolean sameLetter(String firstWord, String secondWord){
        boolean sameLetter = true;int count = 0;
        for(int i=0; i<secondWord.length(); i++) {
            if (firstWord.toLowerCase().contains(String.valueOf(Character.toLowerCase(secondWord.charAt(i))))){
                count++;
            }
        }
        sameLetter = count == (secondWord.length());

       return sameLetter;
    }
///
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        String firstWord = input.nextLine();
        System.out.println("Enter your second word.");
        String secondWord = input.nextLine();

        System.out.println(sameLetter(firstWord, secondWord));
    }
}
/*
Character.toLowerCase(secondWord.charAt(i)) == Character.toLowerCase(firstWord.charAt(j))
String --- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:
 */