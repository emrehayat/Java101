package advancedcalculator;

import java.util.Scanner;

public class AdvancedCalculator {

    static void plus() {
        Scanner input = new Scanner(System.in);
        int counter;

        do {
            System.out.print("Kaç tane sayı gireceksiniz? => ");
            counter = input.nextInt();
            if (counter < 1) {
                System.out.println("Geçerli sayıda değer giriniz!");
            }
        } while (counter < 1);

        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = input.nextInt();
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        int counter;

        do {
            System.out.print("Kaç tane sayı gireceksiniz? => ");
            counter = input.nextInt();
            if (counter < 1) {
                System.out.println("Geçerli sayıda değer giriniz!");
            }
        } while (counter < 1);

        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        int counter;

        do {
            System.out.print("Kaç tane sayı gireceksiniz? => ");
            counter = input.nextInt();
            if (counter < 1) {
                System.out.println("Geçerli sayıda değer giriniz!");
            }
        } while (counter < 1);

        int number, result = 1;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = input.nextInt();
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void divide() {
        Scanner input = new Scanner(System.in);
        int counter;

        do {
            System.out.print("Kaç tane sayı gireceksiniz? => ");
            counter = input.nextInt();
            if (counter < 1) {
                System.out.println("Geçerli sayıda değer giriniz!");
            }
        } while (counter < 1);

        double number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = input.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            if (number == 0) {
                System.out.println("Bölen sayı 0 olamaz!");
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç: " + result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç: " + result);
    }

    static void mode() {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = input.nextInt();

        int result = a % b;
        System.out.println("Sonuç: " + result);
    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Uzun kenarı giriniz: ");
        int a = input.nextInt();
        System.out.print("Kısa kenarı giriniz: ");
        int b = input.nextInt();

        System.out.println("Dikdörtgenin çevresi: " + (2 * (a+b)));
        System.out.println("Dikdörtgenin alanı: " + (a * b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1-Toplama İşlemi\n"
                + "2-Çıkarma İşlemi\n"
                + "3-Çarpma İşlemi\n"
                + "4-Bölme işlemi\n"
                + "5-Üslü Sayı Hesaplama\n"
                + "6-Faktoriyel Hesaplama\n"
                + "7-Mod Alma\n"
                + "8-Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0-Çıkış Yap";
        do {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();
            switch (select) {
                case 0:
                    break;
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
            }
        } while (select != 0);
    }
}