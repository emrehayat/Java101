package numberguessinggame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println("SAYI TAHMİN OYUNU");

        while (right < 5) {
            System.out.print("Tahmininizi giriniz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir sonraki hatalı girişinizde hakkınız azalacaktır.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin!");
                System.out.println("Seçilen sayı: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Yanlış tahmin!");
                if (selected > number) {
                    System.out.println("Tahmin ettiğiniz değer, asıl sayıdan daha büyük.");
                } else {
                    System.out.println("Tahmin ettiğiniz değer, asıl sayıdan daha küçük.");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hakkınız: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Seçilen sayı: " + number);
            if (!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }
        }
    }
}