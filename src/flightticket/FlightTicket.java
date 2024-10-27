package flightticket;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        int age, distance, journeyType;
        double price, totalPrice, lastPrice, discount=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Mesafeyi giriniz (km): ");
        distance = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1: Tek yön, 2: Gidiş-Dönüş): ");
        journeyType = input.nextInt();

        if (age<0 || distance<0 || (journeyType!=1 && journeyType!=2)) {
            System.out.println("Hatalı veri girişi!");
            return;
        }

        price = 0.1 * distance;

        if (age<12) {
            discount = price * 0.5;
        } else if (age<=24) {
            discount = price * 0.1;
        } else if (age>65) {
            discount = price * 0.3;
        }

        totalPrice = price - discount;

        if (journeyType == 2) {
            lastPrice = 2 * (totalPrice - totalPrice * 0.2);
            System.out.println("Toplam tutar: " + lastPrice + "TL");
        } else {
            System.out.println("Toplam tutar: " + totalPrice + "TL");
        }
    }
}