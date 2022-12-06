package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = checkHorizontal(board) || checkVertical(board);
        return rsl;
    }

    public static boolean checkHorizontal(int[][] board) {
        boolean rsl = true;
        for (int row = 0; row < board.length; row++) {
            rsl = true;
            for (int cell = 0; cell < board[row].length; cell++) {
                if (board[row][cell] == 0) {
                    rsl = false;
                    break;
                }
            }
            if (rsl) {
                break;
            }
        }
        return rsl;
    }

    public static boolean checkVertical(int[][] board) {
        boolean rsl = true;
        for (int cell = 0; cell < board.length; cell++) {
            rsl = true;
            for (int row = 0; row < board[cell].length; row++) {
                if (board[row][cell] == 0) {
                    rsl = false;
                    break;
                }
            }
            if (rsl) {
                break;
            }
        }
        return rsl;
    }
}
