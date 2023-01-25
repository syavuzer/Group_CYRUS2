package Ephrem2;

import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word.");
        String word = input.nextLine();

        System.out.println(reverse(word));
    }
    public static String reverse(String word){
        String reverseWord = "";
        for(int i = word.length()-1; i>=0; i--){
            reverseWord += String.valueOf(word.charAt(i));
        }
        return reverseWord;
    }
}
