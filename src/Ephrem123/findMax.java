package Ephrem123;

import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]numbers = new int[5];
        System.out.println("Enter five numbers.");
        for (int i=0; i<numbers.length;i++) {
            numbers[i]=input.nextInt();
        }

        System.out.println(num(numbers));
    }
    public static String num(int[]numbers){
        int maximum = Integer.MAX_VALUE;
        for (int num: numbers){
            //maximum  = (maximum >num)?maximum :num;
            maximum = Math.max(maximum,num);
        }
        return "The maximum number is " +maximum ;
    }
}
