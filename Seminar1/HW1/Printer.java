package HW1;

class Answer {
    public static void arrayOutOfBoundsException() {
        int[] arr = new int[10];
        System.out.println(arr[11]);
      
}

    public static void divisionByZero() {
        // Напишите свое решение ниже
      int a = 10;
      int b = 0;
      System.out.println(a/b);
}

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String s = "123q";
        Integer.parseInt(s);
 }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            Answer.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            Answer.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            Answer.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
