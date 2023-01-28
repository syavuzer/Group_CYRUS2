package Ephrem2;
import java.util.Scanner;

public class findMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]numbers = new int[5];
        for (int i=0; i<numbers.length;i++) {
            System.out.println("Enter a number");
            numbers[i]=input.nextInt();
        }

        System.out.println(num(numbers));
    }
    public static int num(int[]numbers){
        int maxnum = 0;
        for (int num: numbers){
            maxnum = (maxnum>num)?maxnum:num;
        }
        return maxnum;
    }
}
