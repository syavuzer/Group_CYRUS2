package Ephrem2;

import java.util.Scanner;

public class passwordValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password (must be six and above character and must contain one capital letter, "
                +"one lower letter, one digit and one special character)");
        String password = input.next();

        System.out.println(validatePassword(password));
    }
    public static String validatePassword(String password){
        String passCreate = "";boolean isCapital = false , isLower = false , isSpecial = false, isDigit = false;
        if (password.length()>=6){
            for(int i=0; i<password.length(); i++){
                if(Character.isUpperCase(password.charAt(i))){
                    isCapital = true;
                }else if(Character.isLowerCase(password.charAt(i))){
                    isLower = true;
                }else if(Character.isDigit(password.charAt(i))){
                    isDigit = true;
                }else if(!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))){
                    isSpecial = true;
                }
            }
            passCreate = (isCapital && isLower && isDigit && isSpecial )?"Password created successfully":
                    (!isCapital)?"password should contain at least one UpperCase":(!isLower)?"password should contain "+
                            "at least one lowerCase":(!isDigit)?"password should contain at least one Digit":
                            "password should contain at least one Special character";

        }else {
            passCreate = "password should have six characters.";
        }

        return passCreate;
    }
}
