package MODULE2;

import java.util.Scanner;

// WAP to print factorial of a number 5=5*4*3*2*1
public class factorialNumber {

    public static void main(String[] args) {
        int f=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for factorial ");
        n=sc.nextInt();
//        while(n>0){
//
//            f=f*n;
//
//            n--;
//
//        }
//        System.out.println(f);
//

        for(int i=1 ;i<=n;n--){
            f=f*n;
        }
        System.out.println(f);


    }
}
