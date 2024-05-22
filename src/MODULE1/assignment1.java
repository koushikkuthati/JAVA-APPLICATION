import java.util.Scanner;

/*
Hey! Now that you’re familiar with the basics of Java programming,
let’s write a small java program to generate a Student ID Card.


Desired Output:

Problem Statement:
Write a Java program that will take user input and print his
 Name, Age, Blood Group, and also his Group to which he belongs in the school.

Approach:

Write the code for user input
Initialise class Scanner
Ask for Student’s name and store it in a String variable
Ask for Student’s age and store it in the Integer variable
Ask for Student’s blood group and store it in a String variable
Once you have got all user inputs, it’s time to decide the group
to which the student belongs to. Let's divide the students into three groups:
RED, BLUE, and YELLOW. A group for a student is decided based on his age.


RED: If the age of a student is greater than or equal to 20 then he belongs to the RED group
BLUE: If the age of a student is greater than or equal to 15 but smaller
 than 20 then he belongs to the BLUE group.
YELLOW: If the age of a student is greater than or equal to 10 but smaller
 than 15 then he belongs to the YELLOW group
You need to use IF-ELSE-IF Ladder statements to decide the group for the student based on his age.

Once you have got all the attributes such as name, age, blood group, and group name,
 you need to print out the Student ID Card that should look similar to the desired output.
Hints:

To draw dashed lines use hyphen symbol in the print statement

Important Instructions:

i) Please upload your assignment solution here.

ii) You will be able to download the ideal solution from the next Module Test solution screen.
Go ahead and self-evaluate yourself using this ideal solution.
 */
public class assignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name,bg,r="";
        int age;
        System.out.println("enter your name");
        name=sc.nextLine();
        System.out.println("enter your age");
        age=sc.nextInt();
        System.out.println("enter your blood group");
        bg= sc.nextLine();

        if(age>=20){
             r="Your group is RED";
            
        } else if (age>=15 &&  age <20) {
            r="Your group is BLUE";
        }
        else if(age >=10 && age<15){
            r= "Your group is YELLOW";
        }
        else {
            System.out.println("Enter a valid age 10+");
        }


        System.out.println("-----------------------------");
        System.out.println("NAME : "+name);
        System.out.println("AGE : "+age);
        System.out.println("Blood Group :"+ bg);
        System.out.println("-----------------------------");
        System.out.println("Your group is "+r);
        System.out.println("-----------------------------");
    }

}
