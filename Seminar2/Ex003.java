package Seminar2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Ex003 {
    public static void main(String[] args) {
        // InputStream inputStream;
        try {
            String[] strings = { "asdf", "asdf" };
            // String stringsl = strings[2]; // такого индекса в массиве нет
            test();
            int a = 1 / 0;
            InputStream inputStream = new FileInputStream("safddsasdf");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    public static void test() throws IOException {
        File file = new File("1");
        FileReader reader = new FileReader(file);
        try {
            // File file = new File("1");
            file.createNewFile();
            // FileReader reader = new FileReader(file);
            reader.read();
            test();
        } catch (StackOverflowError error) {
            System.out.println("Переполнение стека рекурсии");
        } finally {
            reader.close();
        }
    }
}
