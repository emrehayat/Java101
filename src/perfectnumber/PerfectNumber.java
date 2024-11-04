package perfectnumber;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int total = 0;

        if (number > 0) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    total += i;
                }
            }
            if (total == number) {
                System.out.println(number + " bir mükemmel sayıdır.");
            } else {
                System.out.println(number + " bir mükemmel sayı değildir.");
            }
        } else {
            System.out.println("Pozitif bir sayı giriniz!");
        }
    }
}