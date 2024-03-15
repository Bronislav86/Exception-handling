package Seminar3;
    // 1. Напишите метод,на вход которогоподаётся двумерный строковый массив
    // размером 4х4. При подаче массива другого размера необходимо бросить
    // исключение MyArraySizeException.
    // 2. Далееметод долженпройтисьпо всем элементам массива,преобразоватьв
    // int и просуммировать. Если в каком-то элементе массива преобразование
    // не удалось (например, в ячейке лежит символ или текст вместо числа),
    // должно быть брошено исключение MyArrayDataException с детализацией, в
    // какой именно ячейкележат неверныеданные.
    // 3. В методе main() вызвать полученный метод, обработать возможные
    // исключения MyArraySizeException и MyArrayDataException и вывести
    // результатрасчета (сумму элементов,при условиичто подали на вход
    // корректныймассив).

public class Ex005 {

    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, { "1", "2", "3", "4" }};
        System.out.println(sumArray(array));
    }

    public static int sumArray(String[][] arr) {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }
        int resSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int value = Integer.parseInt(arr[i][j]);
                    resSum += value;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }

        return resSum;
    }
}

class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super("Размер массива не соответствкет условию.");
    }

}

class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException() {
        super("Невозможно преобразовать значение массива в число.");
    }
}
