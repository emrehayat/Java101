package recursiveprimenumber;

import java.util.Scanner;

public class RecursivePrimeNumber {
    static boolean isPrime(int number, int divisor) {
        if (number < 2) return false;
        if (divisor == 1) return true;
        if (number % divisor == 0) return false;
        return isPrime(number, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        if (isPrime(number, number / 2)) {
            System.out.println(number + " sayısı asaldır!");
        } else {
            System.out.println(number + " sayısı asal değildir!");
        }
    }
}