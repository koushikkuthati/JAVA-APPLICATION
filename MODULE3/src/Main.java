import Exercise.CalculateArea;

import java.awt.geom.Area;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        CalculateArea c=new CalculateArea();

        System.out.println("Select shape to calculate :");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3.Circle");

        int choice=sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter length for Rectangle");
                int length=sc.nextInt();
                System.out.println("Enter breadth for Rectangle");
                int breadth=sc.nextInt();
                int AreaOfRectangle=c.AreaOfRectangle(length,breadth);
                System.out.println("Area of Rectangle is :"+ AreaOfRectangle);
                double Perimeter=c.PerimeterOfRectangle(length,breadth);
                System.out.println("Perimeter of Rectangle is :"+Perimeter);
                break;
            case 2:
                System.out.println("Enter length for Square");
                int length1=sc.nextInt();
                int AreaOfSquare=c.AreaOfSquare(length1);
                System.out.println("Area of Sqaure is :"+ AreaOfSquare);
                break;
            case 3 :
                System.out.println("Enter Radius of Circle :");
                float radius = sc.nextFloat();
                 float AreaOfCircle=c.AreaOfCircle(radius);
                System.out.println("Area of circle is :"+AreaOfCircle);
                break;
            default:
                System.out.println("Enter a valid option");
                break;


        }
        sc.close();


    }
}