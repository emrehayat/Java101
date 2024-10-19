package daire;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, circumference, area, a, sliceArea;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz (cm): ");
        r = input.nextInt();
        circumference = 2 * pi * r;
        System.out.println("Dairenin çevresi: " + circumference + " cm");
        area = pi * r * r;
        System.out.println("Dairenin alanı: " + area + " cm^2");
        System.out.println("-----------------------------------------");
        System.out.println("Şimdi de daire diliminin alanını bulalım.");
        System.out.print("Merkez açının ölçüsünü giriniz (derece): ");
        a = input.nextDouble();
        sliceArea = (pi * r * r * a) / 360;
        System.out.println("Daire diliminin alanı: " + sliceArea + " cm^2");

    }
}
