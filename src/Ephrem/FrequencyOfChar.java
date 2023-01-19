package Ephrem;
import java.util.Scanner;

public class FrequencyOfChar {
    public static String frequency(String word){
        int count = 0; String charCount ="";
        for (int i =0; i < word.length(); i++) {
            count = 0;
            for (int j=0; j<word.length(); j++){
                if(Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(word.charAt(j))){
                    count++;
                }
            }
            if(!charCount.toLowerCase().contains(""+Character.toLowerCase(word.charAt(i)))){
                charCount+=word.charAt(i)+String.valueOf(count);
            }
        }
        return charCount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = input.nextLine();

        System.out.println(frequency(word));
    }
}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */