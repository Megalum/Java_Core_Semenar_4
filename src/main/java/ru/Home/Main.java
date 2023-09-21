package ru.Home;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int k = 0; k < 10; k++) {
            try {
                Random random = new Random();
                MyArray array = new MyArray();

                if (random.nextInt(100) < 25)
                    array.size(5, 5);
                else
                    array.size(4, 4);

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (random.nextInt(100) < 10) {
                            array.add(i, j, random.nextInt(100) + "!");
                        }
                        else {
                            array.add(i, j, String.valueOf(random.nextInt(100)));
                        }
                    }
                }

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(array.getNumber(i, j) + " ");
                    }
                    System.out.println();
                }

                for (int i = 0; i < 4; i++)
                    for (int j = 0; j < 4; j++)
                        array.data(array.getNumber(i, j), i, j);

                System.out.println(array.getSum() + "\n");

            } catch (MyArrayDataException e) {
                System.out.printf("Ошибка конвертации строки (%s) в число на позиции %d:%d\n\n", e.getNumber(), (e.getRow() + 1), (e.getCol() + 1) );
            } catch (MyArraySizeException e) {
                System.out.println("Ошибка при попытке задать размерность не 4х4\n");
            } catch (Exception e){
                System.out.println("Что-то пошло не по плану(((");
            }
        }
    }
}