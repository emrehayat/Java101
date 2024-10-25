package temperature;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        int temp;
        System.out.print("Sıcaklığı giriniz: ");
        Scanner input = new Scanner(System.in);
        temp = input.nextInt();

        if (temp < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (temp < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (temp < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzebilirsiniz.");
        }
    }
}