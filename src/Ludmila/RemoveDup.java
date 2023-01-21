package Ludmila;

public class RemoveDup {
    public static String ReturnDup(String str) {
    String str1 = "";
        for (int i = 0; i <str.length() ; i++) {
        if(!str1.contains(String.valueOf(str.charAt(i)))){
            str1+=String.valueOf(str.charAt(i));
        }
    }
        return str1;
}
    public static void main(String[] args) {
        System.out.println(ReturnDup("AAABBBCCC"));
    }
}
