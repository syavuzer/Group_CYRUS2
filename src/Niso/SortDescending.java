package Niso;

import java.util.Arrays;
import java.util.Collections;

public class SortDescending {

    public static void main(String[] args) {

        //Question3: Array - Sort Descending
        //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
        //Ex: int[] arr = {10,20,7, 8, 90};
        // arr = Sort(arr); ==> {90, 20, 10, 8, 7};

        Integer [] array = {10,20,7, 8, 90};
        // sorts array[] in descending order
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " +Arrays.toString(array));
    }
}



