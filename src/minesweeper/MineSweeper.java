package minesweeper;

import java.util.Random;

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
}