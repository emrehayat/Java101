package kdv;

import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        double fiyat, kdv, kdvDahilFiyat;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyatı giriniz: ");
        fiyat = input.nextDouble();

        kdv = (fiyat <= 1000) ? 0.18 : 0.08;
        kdvDahilFiyat = fiyat + fiyat*kdv;

        System.out.println("KDV'siz Fiyat: " + fiyat);
        System.out.println("KDV Oranı: " + kdv);
        System.out.println("KDV Miktarı: " + (kdvDahilFiyat - fiyat));
        System.out.println("KDV Dahil Fiyat: " + kdvDahilFiyat);
    }
}