import java.util.Scanner;

public class example {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int inputSeconds,hours,minutes,seconds;

        System.out.println("Enter seconds:");
        inputSeconds=sc.nextInt();

        hours=inputSeconds/3600;
        inputSeconds=inputSeconds%3600;
        minutes=inputSeconds/60;
        seconds=inputSeconds%60;
        System.out.println(hours+" hour "+minutes+" minutes"+seconds+" seconds");












    }
}
