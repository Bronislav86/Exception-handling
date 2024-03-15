package HW4;

public class Ex008 {
/*
Реализуйте метод, принимающий в качестве аргументов двумерный массив.
Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
детализировать какие строки со столбцами не требуется.
Как бы вы реализовали подобный метод?
 */
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11}, {13, 14, 15, 16}};
        chekArray(array);
    }

    private static void chekArray(int[][] array) {
        if (array == null) {
            throw new RuntimeException("Массив пустой!");
        }
        int rowLength = 0;
        int colLength = array.length;
        for (int i = 0; i < array.length; i++) {

            rowLength = array[i].length;
            
            // for (int j = 0; j < array[i].length; j++) {
            //     rowLength++;
            // }
            if (rowLength != colLength) {
                throw new  RuntimeException("Строка " + toString(array[i]) + " не равна столбцу массива");
            }
            rowLength = 0;
        }
    }

    public static String toString(int[] arr) {
        String string = new String();
        for (int element : arr) {
            string += element;
            string += ", ";
        }
        return string.substring(0, string.length() - 2);
    }
}
