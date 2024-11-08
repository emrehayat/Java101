package recursiveexponent;

import java.util.Scanner;

public class RecursiveExponent {
    static int exponent(int base, int power) {
        if (power == 0) {
            return 1;
        } else {
            return base * exponent(base, power - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int m = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int n = input.nextInt();

        int result = exponent(m, n);
        System.out.println("Sonuç: " + result);
    }
}