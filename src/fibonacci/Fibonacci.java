package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int n = input.nextInt();
        int total;
        int a = 0, b= 1;
        System.out.print(a + " " + b);

        for (int i = 0; i < n-1; i++) {
            total = a + b;
            a = b;
            b = total;
            System.out.print(" " + total);
        }
    }
}