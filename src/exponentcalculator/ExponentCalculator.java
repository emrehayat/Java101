package exponentcalculator;

import java.util.Scanner;

public class ExponentCalculator {
    public static void main(String[] args) {
        int a, b, total = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        a = input.nextInt();

        System.out.print("Üs giriniz: ");
        b = input.nextInt();

        for (int i = 1; i <= b; i++) {
            total *= a;
        }
        System.out.println(a + "^" + b + "=" + total);
    }
}