package ru.Home;

public class MyArraySizeException extends Exception {

    private final int row, col;

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
    public MyArraySizeException(String message, int row, int col) {
        super(message);
        this.row = row;
        this.col = col;
    }
}
