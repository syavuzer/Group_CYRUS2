package Niso;

import java.util.Arrays;

public class SortAscending {

    public static void main(String[] args) {

        //Question2: Array - Sort Ascending
        //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        //Ex: int[] arr = {10, 9, 8, 7};
        // arr = Sort(arr); ==>{ 7, 8, 9, 10};

        int [] array = new int [] {10, 9, 8, 7};
        //invoking sort() method of the Arrays class
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
        //prints array using the for loop
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}



