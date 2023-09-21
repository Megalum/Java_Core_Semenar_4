package ru.Home;

public class MyArrayDataException extends MyArraySizeException {

    private final String number;

    public String getNumber() {
        return number;
    }

    public MyArrayDataException(String message, int row, int col, String number) {

        super(message, row, col);
        this.number = number;
    }
}
