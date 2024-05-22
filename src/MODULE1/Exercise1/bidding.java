package Exercise1;
/*
It's time for the highest bid.
Ask three friends of yours to enter their bid for a Harry Potter
 antique broomstick and find out the highest bid by writing a program to
 calculate so in just a single line.
 */

import java.util.Scanner;

public class bidding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println(" first bid ");
        a=sc.nextInt();
        System.out.println("second bid ");
        b=sc.nextInt();
        System.out.println("third bid ");
        c=sc.nextInt();

        if (a>b && a > c){
            System.out.println(a +"is highest bid");

        } else if (b > a && b > c) {
            System.out.println(b + " is highest bid");

        }
        else
            System.out.println(c+ " is highest bid");

    }
}
