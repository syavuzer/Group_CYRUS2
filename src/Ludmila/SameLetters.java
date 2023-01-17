package Ludmila;

import java.util.Arrays;
import java.util.Scanner;

public class SameLetters {
    public static boolean same(String str1, String str2){
        char[] first = str1.toCharArray();
        char[] second = str2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first,second);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {


            System.out.println("Enter first word:");
            String word1 = input.next().toLowerCase();

            input.nextLine();

            System.out.println("Enter second word: ");
            String word2 = input.next().toLowerCase();

            System.out.println(word1 + " and " + word2 + " have same letters: " + same(word1, word2));

            System.out.println("Would you like to enter another words? yes/no");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry! Would you like to enter another words? yes/no");
                answer = input.next().toLowerCase();
            }
            if (answer.equals("no")) {
                System.out.println("Thank you for using our program!");
                break;
            }

        }
    }}
/*
String -- Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false
 */

