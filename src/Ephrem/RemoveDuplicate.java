package Ephrem;

import java.util.Scanner;

public class RemoveDuplicate {
    public static String duplicate(String word){
        String unique = "";
        String wordLower = word.toLowerCase();
        for(int i=0; i<word.length(); i++){
            if (!unique.toLowerCase().contains(String.valueOf(wordLower.charAt(i)))) {
                unique += word.charAt(i);
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

        System.out.println(duplicate(word));
    }
}
/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */