import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1,name2;
        int a,b,c=0;

        System.out.println("Enter name of student 1");
        name1=sc.nextLine();
        System.out.println("Enter name of student 2");
        name2=sc.nextLine();
        System.out.println("Enter marks of "+name1);
        a=sc.nextInt();
        System.out.println("Enter marks of "+name2);
        b=sc.nextInt();

        System.out.println("-------BEFORE SWAPPING------- ");
        System.out.println(name1+" = "+a);
        System.out.println(name2+" = "+b);
        System.out.println("-------------------------------");

        c=a;
        a=b;
        b=c;
        System.out.println();
        System.out.println("-------After SWAPPING------- ");
        System.out.println(name1+" = "+a);
        System.out.println(name2+" = " +b);
        System.out.println("-------------------------------");



    }
}
