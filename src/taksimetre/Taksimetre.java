package taksimetre;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double acilis = 10, kmTutar = 2.20, minTutar = 20, mesafe, tutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi giriniz (km): ");
        mesafe = inp.nextDouble();
        tutar = acilis + kmTutar * mesafe;
        tutar = tutar > 20 ? tutar : minTutar;

        System.out.println("Toplam tutar (TL): " + tutar);
    }
}
