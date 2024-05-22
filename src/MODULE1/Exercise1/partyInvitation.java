package Exercise1;
/*Make an invitation to a birthday party at your place.
 Input your friend's name and print the message :
        "Hey <friendName>, it's my birthday this weekend
        and you are invited to the party at my place. Bring gifts!!! "
        Example -
        Input: Tom
        Output: Hey Tom, it's my birthday this weekend and
         you are invited to the party at my place. Bring gifts!!!

 */
import java.util.Scanner;

public class partyInvitation {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name ");
        String name=sc.nextLine();
        System.out.println("Hey "+name+" It's my birthday this weekend and  you are invited to the party at my place . Bring Gifts!!!");


    }
}
