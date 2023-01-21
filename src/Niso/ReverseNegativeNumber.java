package Niso;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        int number = -987653, reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        //System.out.println("The reverse of the given negative number is: " + reverse);
        System.out.println(reverse);
    }
}

   /*
  2. Numbers -- Reverse negative number
     Write a return method that can reverse
     negative number and return it as int

   */


   /*//second solution about reverse

    public static int reverseUsingString(int num){

        String numAsStr=String.valueOf(num);
        String[] numInStrArray=numAsStr.split("");
        //System.out.println(Arrays.toString(numInStrArray));
        String result="";
        for (int i = numInStrArray.length-1; i >0 ; i--) {
            result+=numInStrArray[i];
        }
      return -1*Integer.parseInt(result);
    }
 */


