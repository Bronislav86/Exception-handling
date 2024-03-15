package Seminar3;

import java.io.FileNotFoundException;

public class Ex004 {
    public static void main(String[] args) {
        int index = 0;
        throw new NullPointerArray(index);
    }
}


class DivByZero extends ArithmeticException {
/**
 * DivByZero
 * @disription Это исключние при делении на ноль.
 */
    public DivByZero() {
        super("Деление на ноль невозможно");
    }
}

class NullPointerArray extends NullPointerException {
    public NullPointerArray(int index) {
        super("Обращеине к пустому элементу массива, находящеиуся на индексе " + index);
    }

    public NullPointerArray() {
        super("Обращеине к пустому элементу массива!");
    }
}

class NotFoundFile extends FileNotFoundException {
    public NotFoundFile(String path) {
        super("Не найден файл по заданному пути: " + path);
    }
    public NotFoundFile(){
        super("Не найден файл");
    }
}
