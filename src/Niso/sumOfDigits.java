package Niso;

public class sumOfDigits {

    public static void main(String[] args) {


        String s = "abcd436g9";
        int sum = 0;
        String num = "";
        char c[] = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum = sum + Character.getNumericValue(s.charAt(i));
            }

        }
        System.out.println("Sum of the dijit number in a string(" + s + ")= " + sum);


    }

}


   //Write a method that can return the sum of the digits in a string










