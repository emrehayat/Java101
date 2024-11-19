package arraysorting;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("Dizinin elemanlarını giriniz.");

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". elemanı: ");
            int j = input.nextInt();
            array[i] = j;
        }
        Arrays.sort(array);
        System.out.println("Sıralama: " + Arrays.toString(array));
    }
}