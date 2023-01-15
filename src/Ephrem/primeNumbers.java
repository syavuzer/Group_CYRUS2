package Ephrem;
import java.util.Scanner;

public class primeNumbers {
    public static String prime (int num){
        String prime = "";int count =0;

        for(int i=2; i<=num/2; i++){
           if(num%i==0) {
               count++;
               break;
           }
        }
        prime=(num>1 && count==0)? (num+" is prime number") : (num+" is not prime number");

        return  prime;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println(prime(num));
    }
}
