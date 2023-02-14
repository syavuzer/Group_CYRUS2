package Niso;

public class MaxNum {

    public static void main(String[] args) {


        //Write a method that can find the maximum number from an int Array
        int[] num = {20, 80, 50, 345, 285,};
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
       System.out.println("max = " + max);

    }

}



/*
        // max and min number, you should to change callas name -->(main)
        double x = 3.14;
        double y = -10;
        double z = Math.min(x, y);
        System.out.println(z); //with double max or min number
/*
        int x = 2000;
        int y = -10;
        int z = Math.max(x, y);
        System.out.println(z); //with integer max or min number



    }
}

 */


