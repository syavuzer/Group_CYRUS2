package Ephrem123;

public class findMin {
    public static void main(String[] args) {
        int[] rNumbers = {12,2,6,8,9};
        System.out.println(minNum(rNumbers));
    }
    public static int minNum(int[]rNumbers){
        int element = Integer.MIN_VALUE;
        for (int num:rNumbers) {
            element = (num<element)?num:element;
            //element = Math.min(element,num);
        }
        return element;
    }
}
