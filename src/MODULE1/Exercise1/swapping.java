package Exercise1;

import java.util.Scanner;

/*
You work in pairs in the computer lab.
 Play a prank with your partner and swap the marks entered for him with yours.
 Remember, you can only use 2 variables, else you'll get caught.
Example -
Input: a = 24, b = 43
Output: a = 43, = 24
 */
public class swapping {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c=0;
        System.out.print("a = ");
        a=sc.nextInt();
        System.out.print (" b = ");
        b=sc.nextInt();

        c=a;
        a=b;
        b=c;
        System.out.println("a ="+a+" b= "+b);



    }
}
