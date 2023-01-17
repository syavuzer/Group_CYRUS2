package Ludmila;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveBupLinkedHasSet {
    public static void main(String[] args) {
        String str="assssaoiuiog";
        Set<Character> set=new LinkedHashSet<>();
        for (char eachElement:str.toCharArray()) {
            set.add(Character.valueOf(eachElement));
        }
        System.out.println(set);//[a, s, o, i, u, g]
    }
}
