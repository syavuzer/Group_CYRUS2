package Ludmila;

import java.util.Scanner;

public class FrequencyOfCharacters {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println(countLetters(scan.next()));
        }

        public static String countLetters(String str){
            String result="";
            for(int i=0; i<str.length();i++){
                char ch=str.charAt(i);
                int num=0;
                for(int j=0; j<str.length();j++){

                    if(str.charAt(j)==ch){
                        num++;
                    }
                }
                if(result.contains(""+ch)){
                    continue;
                }
                result+=num+""+ch;
            }
            return result;
        }}
/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */

