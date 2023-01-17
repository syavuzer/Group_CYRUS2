package Ephrem;
import java.util.Scanner;

public class reverseNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a negative number");
        int negative = input.nextInt();
        if (negative>=0){
            System.err.println("only negative number accepted");
            System.out.println("Enter a negative number");
            negative = input.nextInt();
        }

        System.out.println(negativeNum(negative));
    }
    public static String negativeNum(int negative){
        String num = "";
        for(int i=negative; 0>i; i++ ){
            num = (i<-1)?(num+String.valueOf(-1*i)+", "):(num+String.valueOf(-1*i));

        }

        //int absNegative = -1*negative; we can also use this.

        return num;
    }
}
