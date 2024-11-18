package arrayminmax;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] array = {20, -22, 13, 17, 9, -4, 7, 11, -8, 39};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sıralı Hali: " + Arrays.toString(array));
        System.out.println("En büyük değer: " + array[array.length - 1]);
        System.out.println("En küçük değer: " + array[0]);

        System.out.println("---------ÖDEV---------");
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int min = 0;
        int max = 0;

        for (int j : array) {
            if (j < number) {
                min = j;
            } else if (j > number) {
                max = j;
                break;
            }
        }
        System.out.println(number + " sayısından küçük en büyük sayı: " + min);
        System.out.println(number + " sayısından büyük en küçük sayı: " + max);
    }
}