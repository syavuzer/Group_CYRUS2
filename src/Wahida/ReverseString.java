package Wahida;

public class ReverseString {

    public static void main(String[] args) {
        String str = "ABCD";
        String reverse= "";//I will create  empty string.

        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
//Use a for loop to  iterate and create a new reversed String. The “charAt” method of the String class is used to
// retrieve each character of the original String individually from the end,
// and the “+” operator is used to concatenate them into a new String.
        }

        System.out.println(reverse);

    }
}
/*
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA

 */









