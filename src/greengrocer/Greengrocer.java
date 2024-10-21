package greengrocer;

import java.util.Scanner;

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
}
