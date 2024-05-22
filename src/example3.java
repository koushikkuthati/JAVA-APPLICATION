import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        String d;
        System.out.println("What is the farthest planet in solar system");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");
        Scanner sc=new Scanner(System.in);
        d=sc.nextLine();
        if(d.equals("venus")){
            System.out.println("incorrect");
        } else if (d.equals("pluto")) {
            System.out.println("correct");
        }
        else if (d.equals("neptune")){
            System.out.println("incorrect");
        }
        else {
            System.out.println("select a valid option or check case sentivity");
        }


    }
}
