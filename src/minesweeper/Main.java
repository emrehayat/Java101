package minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, column;

        System.out.println("----------MAYIN TARLASI----------");

        do {
            System.out.print("Satır sayısını giriniz: ");
            row = input.nextInt();
            System.out.print("Sütun sayısını giriniz: ");
            column = input.nextInt();
            if (row < 2 || column < 2) {
                System.out.println("Geçerli satır ve sütun sayıları giriniz!");
            }
        } while (row < 2 || column < 2);

        MineSweeper game = new MineSweeper(row, column);
    }
}