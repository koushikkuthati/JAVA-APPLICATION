package MODULE2.EXERCISE;

/*
Accept a three digit number from the user (100 to 999).
First, check that the number has only three digits.
Then separate each digit of the number and then arrange them in the reverse order such
that the middle digit remains the same and first and third digit are swapped.
 */

import java.util.Scanner;

public class RearrageThreeDigitNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a three digit number from 100 to 999");
        int a=sc.nextInt();

        if(a>=100 && a<1000){

            int hundredsDigits=a/100;
            int tensDigit= (a/10)%10;
            int unitsDigit=a%10;
            System.out.println(unitsDigit+""+tensDigit+""+hundredsDigits);




        }


    }
}
