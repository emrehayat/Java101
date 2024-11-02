package ebobekok;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();
        int ebob = 1;

        // EBOB hesaplama
        int i = Math.min(n1, n2);
        while (i > 0) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }
        System.out.println("EBOB: " + ebob);

        // EKOK hesaplama
        int ekok = (n1 * n2) / ebob;
        System.out.println("EKOK: " + ekok);
    }
}