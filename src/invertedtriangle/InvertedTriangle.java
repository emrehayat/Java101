package invertedtriangle;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int digit;

        System.out.print("Basamak sayısını giriniz: ");
        digit = inp.nextInt();

        if (digit > 1) {
            for (int i = 0; i < digit; i++) {
                for (int j = 0; j < (2 * (digit - i) - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Geçerli bir değer giriniz!");
        }
    }
}