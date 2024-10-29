package numbers;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        k = input.nextInt();

        int sum = 0, num = 0;

        for (int i=0; i<=k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                num++;
            }
        }
        System.out.println("Ortalama: " + sum / num);
    }
}