package ru.job4j.array;

import java.sql.PreparedStatement;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++ ) {
            if ( board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for ( int i = 0; i < board.length; i++) {
            if ( board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for ( int i = 0; i <rsl.length; i++ ) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public  static  int diagonalInt( char [][] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i][i] == 'X'){
    return  i;
            }
        }
    return  -1;
    }

        public static boolean isWin(char[][] board) {
        boolean result = false;
int index = MatrixCheck.diagonalInt(board);
if ( index != -1){
    if (MatrixCheck.monoHorizontal(board, index) || MatrixCheck.monoVertical(board, index)) {
        result = true;
    }
    }
return result;
    }
}
