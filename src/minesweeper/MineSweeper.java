package minesweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    String[][] board;
    String[][] mineField;
    int row;
    int column;
    int totalMines;
    boolean gameOver = false;

    public MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.totalMines = (row * column) / 4;
        this.board = new String[row][column];
        this.mineField = new String[row][column];
        initializeBoard();
        placeMines();
    }

    public void initializeBoard() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                board[i][j] = "-";
                mineField[i][j] = "-";
            }
        }
    }

    public void placeMines() {
        Random random = new Random();
        int placedMines = 0;
        while (placedMines < totalMines) {
            int x = random.nextInt(row);
            int y = random.nextInt(column);
            if (!mineField[x][y].equals("*")) {
                mineField[x][y] = "*";
                placedMines++;
            }
        }
    }

    public void printBoard(String[][] boardToPrint) {
        for (String[] x : boardToPrint) {
            for (String cell : x) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public int countAdjacentMines(int x, int y) {
        int count = 0;
        int[] dRow = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dCol = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int newRow = x + dRow[i];
            int newCol = y + dCol[i];
            if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < column && mineField[newRow][newCol].equals("*")) {
                count++;
            }
        }
        return count;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mayın tarlası oyununa hoşgeldiniz!");
        while (!gameOver) {
            printBoard(board);
            System.out.print("Satır giriniz (0-" + (row - 1) + "): ");
            int x = scanner.nextInt();
            System.out.print("Sütun giriniz (0-" + (column - 1) + "): ");
            int y = scanner.nextInt();

            if (x < 0 || x >= row || y < 0 || y >= column) {
                System.out.println("Geçersiz koordinat değerleri girdiniz. Yeniden deneyiniz!");
                continue;
            }

            if (!board[x][y].equals("-")) {
                System.out.println("Bu hücre zaten açıldı. Başkasını seçiniz.");
                continue;
            }

            if (mineField[x][y].equals("*")) {
                System.out.println("Oyun bitti! Mayına bastınız.");
                gameOver = true;
                printBoard(mineField);
                break;
            }

            int adjacentMines = countAdjacentMines(x, y);
            board[x][y] = String.valueOf(adjacentMines);

            if (adjacentMines == 0) {
                board[x][y] = "0";
            }

            if (isWin()) {
                System.out.println("Tebrikler! Oyunu kazandınız.");
                printBoard(board);
                break;
            }
        }
        scanner.close();
    }

    public boolean isWin() {
        int openedCells = 0;
        for (String[] x : board) {
            for (String cell : x) {
                if (!cell.equals("-")) {
                    openedCells++;
                }
            }
        }
        return openedCells == (row * column - totalMines);
    }
}