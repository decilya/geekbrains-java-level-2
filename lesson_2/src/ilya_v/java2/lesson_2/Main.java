package ilya_v.java2.lesson_2;

import java.util.Arrays;

public class Main {

    /**
     * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
     * при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
     *
     * @param arr Строковый массив 4x4
     */
    private static void twoStringArr(String[][] arr) {

        if ((arr.length != 4) || (arr[0].length != 4)) throw new MyArraySizeException("Необходим массив размером 4х4");

        System.out.println(Arrays.deepToString(arr));
    }

    /**
     * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int,
     * и просуммировать. Если в каком-то элементе массива преобразование не удалось (например,
     * в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException,
     * с детализацией в какой именно ячейке лежат неверные данные.
     */
    private static int sumAllStrings(String[][] arr) {
        int sum = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[0].length - 1; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("Exception: " + e);
                }
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        String[][] t = new String[4][4];
        String[][] t1 = {{"0", "1g", "2", "3"}, {"0", "1", "2", "3"},{"0", "1", "2", "3"},{"0", "1", "2", "3"}};
        twoStringArr(t1);
        System.out.println(sumAllStrings(t1));
        /*


        2. Далее метод должен пройтись по всем элементам массива, преобразовать в int,
            и просуммировать. Если в каком-то элементе массива преобразование не удалось (например,
             в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException,
             с детализацией в какой именно ячейке лежат неверные данные.

        3. В методе main() вызвать полученный метод, обработать возможные
             исключения MySizeArrayException и MyArrayDataException,
              и вывести результат расчета.  */
    }
}