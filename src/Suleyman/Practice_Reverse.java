package Suleyman;

public class Practice_Reverse {
    public static void main(String[] args) {
        String str = "ABCD";

        String reverse = "";

        for (int i = 3; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        System.out.println(reverse);
    }
}

/*
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA

 */
