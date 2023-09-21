package ru.Home;

public class MyArray {

    protected String[][] array;
    protected int sum = 0;

    public String getNumber(int row, int col) {
        return array[row][col];
    }

    public void add(int row, int col, String number){
        this.array[row][col] = number;
    }

    public int getSum() {
        return sum;
    }

    public MyArray() {

    }

    public void size(int row, int col) throws MyArraySizeException{
        if (row == 4 && col == 4)
        {
            this.array = new String[row][col];
        }
        else {
            throw new MyArraySizeException("Ошибка при указании размера матрицы. Задумывалось 4х4.", row, col);
        }
    }

    public void data(String number, int row, int col) throws MyArrayDataException{
        if (number.matches("-?\\d+(\\.\\d+)?")){
            this.sum += Integer.parseInt(number);
        }
        else {
            throw new MyArrayDataException("Некорректное число в ячейке: ", row, col, number);
        }

    }
}
