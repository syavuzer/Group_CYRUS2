package Wahida;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindTheUnique {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")) );

        list.removeIf( p -> Collections.frequency(list, p) > 1 ); // remove the elements that are not
        // unique THAT MEANS >1

        System.out.println(list);

      /*  String result = list.toString().replace("[", "").replace("]", "").replace(", ", ""); // "DEF"

        System.out.println(result);*/

    }

}



/*
String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";

 */



