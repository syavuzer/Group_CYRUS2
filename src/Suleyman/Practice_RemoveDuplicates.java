package Suleyman;


public class Practice_RemoveDuplicates {

    public static void main(String[] args) {
        String str = "AAABBBCCC";

        String result = "";// create a new string since string is immutable

        for (int i =0; i < str.length(); i++){ // declare a loop iterating the string
            if (result.contains(""+str.charAt(i))){ // create if condition if the character already contain in new string then skip.
                continue;
            }
            result += str.charAt(i);

        }
        System.out.println(result);
    }




}


/*

Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC


 */
