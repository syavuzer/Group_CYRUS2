package Niso;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AAABBCDD";
        str = str.toUpperCase();

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            if(map.get(ch) == null){
                map.put(ch,1);
            }else {
                map.put(ch, map.get(ch)+ 1);
            }
        }
        map.forEach((key, value)->{
            System.out.println(key +""+value);
        });
    }
}

/*
String -- Frequency of Characters in java
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

 */




