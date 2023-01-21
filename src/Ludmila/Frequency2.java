package Ludmila;

public class Frequency2 {
    public static void main(String[] args) {
        String str = "asdfss";
        int[] freq = new int[str.length()];

        char str1[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str1[i] == str1[j]) {
                    freq[i]++;

                }
            }
        }
        System.out.println("Characters  frequencies:");
        for(int i = 0; i <freq.length; i++)
        {
            if(str1[i] != ' ')
                System.out.print(str1[i] + "" + freq[i]);
        }
    }
}
