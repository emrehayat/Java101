package chinesezodiac;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int year;
        String animal = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz yılı giriniz: ");
        year = input.nextInt();

        if (year>0) {
            if (year % 12 == 0) {
                animal = "Maymun";
            } else if (year % 12 == 1) {
                animal = "Horoz";
            } else if (year % 12 == 2) {
                animal = "Köpek";
            } else if (year % 12 == 3) {
                animal = "Domuz";
            } else if (year % 12 == 4) {
                animal = "Fare";
            } else if (year % 12 == 5) {
                animal = "Öküz";
            } else if (year % 12 == 6) {
                animal = "Kaplan";
            } else if (year % 12 == 7) {
                animal = "Tavşan";
            } else if (year % 12 == 8) {
                animal = "Ejderha";
            } else if (year % 12 == 9) {
                animal = "Yılan";
            } else if (year % 12 == 10) {
                animal = "At";
            } else {
                animal = "Koyun";
            }
        } else {
            System.out.println("Geçerli bir doğum yılı giriniz!");
            return;
        }
        System.out.println("Çin Zodyağına Göre Burcunuz: " + animal);
    }
}