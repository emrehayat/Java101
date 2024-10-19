package hipotenus;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int dikKenar, yatayKenar;
        double hipotenus;

        Scanner input = new Scanner(System.in);
        System.out.print("Dik kenar uzunluğunu giriniz: ");
        dikKenar = input.nextInt();
        System.out.print("Yatay kenar uzunluğunu giriniz: ");
        yatayKenar = input.nextInt();

        hipotenus = Math.sqrt(dikKenar*dikKenar + yatayKenar*yatayKenar);

        System.out.println("Hipotenüs uzunluğu: " + hipotenus);

        //Alan hesaplama
        System.out.println("Şimdi de kenar uzunluklarını verdiğiniz bir üçgenin alanını hesaplayalım.");
        double a, b, c, u, alan;
        System.out.print("İlk kenar uzunluğunu giriniz: ");
        a = input.nextDouble();
        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        b = input.nextDouble();
        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        c = input.nextDouble();

        u = (a + b + c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: " + alan);
    }
}
