package Seminar2.HW1;

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(final String[] args) {
        String input;

// При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            input = "Jktu"; // По умолчанию используем "3.14", если аргумент не передан
        } 
        else {
            input = args[0];
        }

        final float result = IsFloat.isFloat(input);
        System.out.println(result);
    }
}

class IsFloat {
    public static float isFloat(final String input) {
    // Введите свое решение ниже
      float floatResult = 0;
      try {
        floatResult = Float.parseFloat(input);
      } catch (NumberFormatException e){
        System.out.println("Your input is not a float number. Please, try again.");
        return floatResult = Float.NaN;
        }
      return floatResult;
    }    
}