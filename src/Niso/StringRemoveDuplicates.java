package Niso;

import java.util.HashSet;
import java.util.Set;

public class StringRemoveDuplicates {

    public static String removeDup(String input){

        Set<Character> unique = new HashSet<>();

        // create a new string builder to store the output
        StringBuilder output = new StringBuilder();

        // iterate through each character in the input string
        for (char c : input.toCharArray()) {
            // if the character is not already in the set, add it to the set and the output string
            if (!unique.contains(c)) {
                unique.add(c);
                output.append(c);
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {

    System.out.println(removeDup("AAABBBCCC"));//ABC

    }
    
}



/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC

 */


