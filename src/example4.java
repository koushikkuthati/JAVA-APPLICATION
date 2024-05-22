/*
 Let's say I've got a 100$ gift card and you want to buy something in your online store .
  Write a program that will help me to buy something and display leftover balance after purchase.
 - If item is not in the list, display message: _**"Invalid item!"**_.
 - If price is more than 100$, display message: _**"Sorry, not enough funds on your gift card!".**_

> **_List of items_**
> Blanket - 60$
> Charger - 25$
> Hat - 25$
> Headphones - 30$
> Laptop - 200$
> Pants - 50$
> Pillow - 40$
> Smartphone - 1000$
> Socks - 5$
> USB cable - 10$

Hint: if/ else if / else

Examples:

```
input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
```

```
input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$
```


```
input: Laptop
Output:
Sorry, not enough funds on your gift card!
```

```
input: Cupcake
output: Invalid item!
```
 */


import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {

        int GiftCard=100;
        String item="";

        String b="Blanket";
        int bp=60;
        String c="Charger";
        int cp=25;
        String h="Hat";
        int hp=25;
        String Hp="HeadPhones";
        int Hpp=30;
        String l="Laptop";
        int lp=200;
        String p="pants";
        int pp=50;
        String pillow="pillow";
        int pillowprice=40;
        String smartP="smartphone";
        int smarprice=1000;
        String socks="socks";
        int socksp=5;
        String usb="usb";
        int usbp=10;

        System.out.println("List of Items");
        System.out.println(b+" "+bp);
        System.out.println(c);
        System.out.println(h);
        System.out.println(Hp);
        System.out.println(l);
        System.out.println(p);
        System.out.println(pillow);
        System.out.println(smartP);
        System.out.println(socks);
        System.out.println(usb);

        Scanner sc=new Scanner(System.in);
        item=sc.nextLine();



        if(item.equals(b) && bp<GiftCard){

            int balance=GiftCard-bp;

            System.out.println("Thank you purchase");
            System.out.println("Your current balance"+balance);
        } else if (item.equals(c) && cp<GiftCard) {

            int balance=GiftCard-cp;
            System.out.println("Thank you purchase");
            System.out.println("Your current balance"+balance);
        }
        else {
            System.out.println("Invaild item");
        }


    }
}
