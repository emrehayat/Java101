package notortalamasi;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        mat = input.nextInt();

        System.out.print("Fizik notu: ");
        fizik = input.nextInt();

        System.out.print("Kimya notu: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notu: ");
        turkce = input.nextInt();

        System.out.print("Tarih notu: ");
        tarih = input.nextInt();

        System.out.print("Müzik notu: ");
        muzik = input.nextInt();

        double toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6;

        System.out.println("Not ortalamanız: " + ortalama);
        String sonuc = ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);

    }
}