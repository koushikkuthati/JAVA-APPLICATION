package variablesanddatatypes;

/*Write a program.
Define two variables for India's GDP = 2.454 trillion dollar
and for India's currency as '\u20B9'.
Furthermore print the following using the two variables defined:
"India has GDP of 2.454 trillion dollar and its currency symbol is ₹".*/



public class problem1 {
    public static void main(String[] args){

        String name="India";
        double GDP=2.454;
        char currency ='\u20B9';

        System.out.println(name+" has GDP of "+GDP+" trillon dollar and its currency symbol is " +currency);


    }
}
