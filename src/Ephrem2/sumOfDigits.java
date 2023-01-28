package Ephrem2;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word that contains digits.");
        String word = input.next();

        System.out.println(sumDigits(word));
    }
    public static int sumDigits(String word){
        int num = 0;
        for (int i=0; i<word.length(); i++) {
            if(Character.isDigit(word.charAt(i))){
                //num+=Integer.parseInt(String.valueOf(word.charAt(i)));
                num+= Character.getNumericValue(word.charAt(i));
            }
        }
        return num;
    }
}
