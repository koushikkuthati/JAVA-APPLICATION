package MODULE2;

import java.util.Scanner;

// WAP to input a number and check if it is prime or not. Write the program using both for loop and while loop
public class checkPrimeORNot {
    public static void main(String[] args) {
        int n;
        boolean isPrime=true;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number to check prime or not ");
        n=sc.nextInt();

        if(n<=1){
            System.out.println("is not prime");
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }


        }
        if(isPrime){
            System.out.println(n+ " is Prime");
        }
        else
            System.out.println(n+ " is not prime");


    }
}
