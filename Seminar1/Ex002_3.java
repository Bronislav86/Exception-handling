public class Ex002_3 {
    // Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
    // Необходимо посчитать и вернуть сумму элементов этого массива.
    // При этом накладываем на метод 2 ограничения: метод может работать только с
    // квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
    // только значение 0 или 1.
    // Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
    // ошибке.
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 1}, {0, 0, 1}, {1, 0, 0}, {4, 5, 6}};
        // checkMatrix(null);
        checkMatrix(matrix);
    }

    public static void checkMatrix(int[][] matrix){
        if (matrix == null)
            throw new RuntimeException("Массив пустой!");
        if (matrix.length != matrix[0].length)
            throw new RuntimeException("Массив не квадратный!");
        int resultSum = 0;
        for (int[] array: matrix){
            for (int el: array){
                if (el != 0 && el != 1)
                    throw new RuntimeException("Массив содержит значения, отличные от 0 и 1!");
                resultSum += el;
            }
        }
        System.out.println("Сумма элементов массива равна: " + resultSum);
    }
}
