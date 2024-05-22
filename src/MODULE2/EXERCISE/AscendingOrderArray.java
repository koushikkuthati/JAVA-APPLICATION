package MODULE2.EXERCISE;
/*
Write a program to accept an array of integers from the user.
After accepting the input, arrange the elements in such a way
that the largest element is at the last index and the smallest is at the 0th index.
The first line of input will denote the number of elements in the array followed by the elements.
Finally, output the re-arranged array in ascending order.
Example -
Input: 5
64 1 32 978 12
Output: 1 12 32 64 978
*/

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class AscendingOrderArray {
    public static void main(String[] args) {

        int n=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in an array");
        n=sc.nextInt();
        Integer[] a=new Integer[n];
        System.out.print("Enter number in an array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("elements in array are :");
        for (int i =0;i<n;i++){
            System.out.print(" "+a[i]);

        }
        System.out.println();
        System.out.println(" After rearraging  elements in array are :");

        Arrays.sort(a);
        for (int i=0;i<n;i++){
            System.out.println(" "+a[i]);
        }





    }
}
