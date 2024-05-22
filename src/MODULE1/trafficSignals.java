import java.util.Scanner;

public class trafficSignals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "You are allowed to move";
        String s2 = "Please stop!";
        String s3 = "Invalid input";

        System.out.println("Enter the traffic light (Green, Red, or Yellow):");
        String signal = sc.next().trim().toLowerCase();

        // Using IF-ELSE
        if (signal.equals("green")) {
            System.out.println(s1);
        } else if (signal.equals("red") || signal.equals("yellow")) {
            System.out.println(s2);
        } else {
            System.out.println(s3);
        }

        // Using Ternary Operator
        String message = signal.equals("green") ? s1 : (signal.equals("red") || signal.equals("yellow") ? s2 : s3);
        System.out.println(message);

        sc.close();





        // alternate solution

//        boolean isGreen = true;
//
//        String message;
//        if (isGreen) {
//            message = "You are allowed to go";
//        } else {
//            message = "Please stop!";
//        }
//
//        System.out.println(message);
//
//        // Using Ternary Operator
//        String msg = isGreen? "You are allowed to go" : "Please stop!";
//        System.out.println(msg);

    }
}
