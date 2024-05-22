package MODULE2;

import java.util.Scanner;

//WAP to add numbers until user enters zero
public class takeInputTillZeroEntered {
    public static void main(String[] args) {

        double c=0,a=0;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("enter a number");
            a=sc.nextInt();
            c=c+a;

        }while (a!=0);

        System.out.println(c);


    }
}
