package sumofnumbers;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz: ");
            n = input.nextInt();
            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0);

        System.out.println("4'e tam bölünen sayıların toplamı: " + total);
    }
}