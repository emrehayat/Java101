package leapyear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir yıl giriniz: ");
        year = input.nextInt();

        if (year>0) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " bir artık yıldır.");
            } else {
                System.out.println(year + " bir artık yıl değildir.");
            }
        } else {
            System.out.println("Geçerli bir yıl giriniz!");
        }
    }
}