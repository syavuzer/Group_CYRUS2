package Niso;

public class PrimeNumber {

    public static void main(String[] args) {

        int i, j = 0, flag = 0;
        int n=7; //it is the number to be checked
        j = n/2;
        if(n==0 || n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2; i<=j; i++){
                if(n % i == 0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }
    }
}



  /*
   1. Numbers -- Prime Number
      Write a method that can check if a number is
      prime or not
   */



