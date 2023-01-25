package Niso;

import java.util.HashMap;
import java.util.Map;

public class StringFoundTheUnique {


        public static String unique(String input) {
            // Create a string builder to store the unique characters
            StringBuilder unique = new StringBuilder();

            // Create a map to store the frequency of each character
            HashMap<Character, Integer> frequency = new HashMap<>();

            // Iterate through the input string and add each character to the map
            // If the character already exists in the map, increment its frequency
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (frequency.containsKey(c)) {
                    frequency.put(c, frequency.get(c) + 1);
                } else {
                    frequency.put(c, 1);
                }
            }

            // Iterate through the map and check for characters with a frequency of 1
            for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
                if (entry.getValue() == 1) {
                    // Add the unique character to the string builder
                    unique.append(entry.getKey());
                }
            }

            // Convert the string builder to a string and return it
            return unique.toString();
        }

    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }




    }




/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */