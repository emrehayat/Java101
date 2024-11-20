package arrayfrequency;

import java.util.Arrays;

public class ArrayFrequency {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] visited = new int[array.length];
        int visitedValue = -1;

        System.out.println("Dizi: " + Arrays.toString(array));
        System.out.println("Tekrar Sayıları:");

        for (int i = 0; i < array.length; i++) {
            if (visited[i] == visitedValue) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = visitedValue;
                }
            }
            System.out.println(array[i] + " sayısı " + count + " kere tekrar etti.");
        }
    }
}