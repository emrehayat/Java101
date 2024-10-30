package combination;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int x, y;
        long total = 1, total2 = 1, total3 = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("x'in y'li kombinasyonu");
        System.out.print("x: ");
        x = input.nextInt();

        System.out.print("y: ");
        y = input.nextInt();

        for (int i = 1; i <= x; i++) {
            total *= i;
        }

        for (int j = 1; j <= y; j++) {
            total2 *= j;
        }

        for (int k = 1; k <= (x - y); k++) {
            total3 *= k;
        }

        long combination = total / (total2 * total3);
        System.out.println("Kombinasyon: " + combination);
    }
}