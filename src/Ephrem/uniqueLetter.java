package Ephrem;
import java.util.Scanner;

public class uniqueLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word.");
        String word = input.nextLine();

        System.out.println(uniqueLetter(word));
    }
    public static String uniqueLetter(String word){
        String [] arrayWord = word.split("");
        int count = 0; String unique = "";
        for (String letter: arrayWord){
            count = 0;
            for (int i=0; i<word.length(); i++){
                count = (letter.equalsIgnoreCase(String.valueOf(word.charAt(i))))?count+1:count;
            }
            unique = (count<=1)?unique+letter:unique;
        }
        return unique;
    }
}
