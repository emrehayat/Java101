package recursivepattern;

import java.util.Scanner;

public class RecursivePattern {
    static void pattern(int n, int temp, boolean decreasing) {
        System.out.print(temp + " ");
        if (temp <= 0) {
            decreasing = false;
        }

        if (decreasing) {
            pattern(n, temp - 5, true);
        } else if (temp != n) {
            pattern(n, temp + 5, false);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        pattern(n, n, true);
    }
}