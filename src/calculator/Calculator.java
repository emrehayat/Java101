package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double a, b;
        int value;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        a = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextDouble();
        System.out.println("1: Toplama\n2: Çıkarma\n3: Çarpma\n4: Bölme");
        System.out.println("İşlemi seçiniz!");
        value = input.nextInt();

        switch (value) {
            case 1:
                System.out.print("Toplam: " + (a + b));
                break;
            case 2:
                System.out.print("Fark: " + (a - b));
                break;
            case 3:
                System.out.print("Çarpım: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.print("Bölüm: " + (a / b));
                    break;
                } else {
                    System.out.print("Bölen değer 0 olamaz!");
                    break;
                }
            default:
                System.out.print("Geçerli bir seçim yapınız!");
        }
    }
}