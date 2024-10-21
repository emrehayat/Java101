package bodyMassIndex;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weight, height, index;
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz (kg): ");
        weight = input.nextDouble();
        System.out.print("Boyunuzu giriniz (m): ");
        height = input.nextDouble();
        index = weight / (height * height);
        System.out.println("Vücut kitle indeksiniz: " + index);
    }
}
