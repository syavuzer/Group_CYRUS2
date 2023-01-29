package Ephrem2;
import java.util.Scanner;

public class findMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]numbers = new int[5];
        System.out.println("Enter five numbers separated by space.");
        for (int i=0; i<numbers.length;i++) {
            numbers[i]=input.nextInt();
        }

        System.out.println(num(numbers));
    }
    public static String num(int[]numbers){
        int maximum = 0;
        for (int num: numbers){
            //maximum  = (maximum >num)?maximum :num;
            maximum = Math.max(maximum,num);
        }
        return "The maximum number is " +maximum ;
    }
}
