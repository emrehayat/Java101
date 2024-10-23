package greengrocer;

/*import java.util.Scanner;

public class Greengrocer {
    public static void main(String[] args) {
        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, aubergine = 5;
        int kgPear, kgApple, kgTomato, kgBanana, kgAubergine;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız? -> ");
        kgPear = input.nextInt();
        System.out.print("Kaç kilo elma aldınız? -> ");
        kgApple = input.nextInt();
        System.out.print("Kaç kilo domates aldınız? -> ");
        kgTomato = input.nextInt();
        System.out.print("Kaç kilo muz aldınız? -> ");
        kgBanana = input.nextInt();
        System.out.print("Kaç kilo patlıcan aldınız? -> ");
        kgAubergine = input.nextInt();

        double total = pear * kgPear + apple * kgApple + tomato * kgTomato + banana * kgBanana + aubergine * kgAubergine;
        String formattedTotal = String.format("%.2f", total);
        System.out.println("Toplam ödemeniz gereken tutar: " + formattedTotal + "TL");
    }
}*/

import java.util.*;

class Solution{
    public static void main(String []args)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");

                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                if (x >= -32768 && x <= 32767)
                    System.out.println("* short");
                if (x >= -2147483648L && x <= 2147483647L)
                    System.out.println("* int");
                if (x >= -9223372036854775808L && x <= 9223372036854775807L)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
