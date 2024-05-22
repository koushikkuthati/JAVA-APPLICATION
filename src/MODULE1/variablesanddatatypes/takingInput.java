package variablesanddatatypes;

//WAP to take user name and age as input
//and print it out. Try to make your program user friendly.
//        Hint: Use integer data type for age and String data type for name.

import java.util.Scanner;

public class takingInput {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter your name");
        name=sc.next();
        System.out.println("Enter your age");
        age=sc.nextInt();

        System.out.println("my name is "+name);
        System.out.println("my age is "+age);

        sc.close();



    }
}
