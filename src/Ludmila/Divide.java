package Ludmila;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter dividend:");
        int dividend= input.nextInt();
        System.out.println("Enter divisor:");
        int divisor= input.nextInt();
        int result=0;
        if(divisor==0){
            System.err.println("Cannot divide by 0");
            // System.exit(1);
        } else if (dividend==0) {
            System.err.println("Divident can not be 0");
            // System.exit(1);
        } else if (dividend==divisor) {
            System.out.println(1);
        } else if (dividend>0&&divisor>0&&dividend<divisor) {
            System.err.println("Divident can not be bigger tnan divisor");
        } else{

            while (dividend>=divisor){
                dividend=dividend-divisor;
                result++;
            }

            System.out.println(result);}
        input.close();
    }
}
