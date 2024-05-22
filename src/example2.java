import java.util.Scanner;

//LASTNAME,FIRSTNAME
//EMAIL
//STREET
//CITY
//STATE
public class example2 {
    public static void main(String[] args) {
        String firstname,lastname,email,street,city,state;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter FirstName:");
        firstname=sc.nextLine();
        System.out.println("Enter LastName:");
        lastname=sc.nextLine();
        System.out.println("Enter Email:");
        email=sc.nextLine();
        System.out.println("Enter street:");
        street=sc.nextLine();
        System.out.println("Enter city:");
        city=sc.nextLine();
        System.out.println("Enter state:");
        state=sc.nextLine();


        System.out.println(firstname+"     "+ lastname+"    " + email+"     "+ street+"    "+city+"    "+state );
    }
}
