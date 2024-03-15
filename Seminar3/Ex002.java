package Seminar3;
import java.io.IOException;

public class Ex002 {

    // Создайте метод doSomething(), который может быть источником одного из
    // типов checked exceptions (тело самогометода прописывать не обязательно).
    // Вызовите этот метод из main и обработайте в нем исключение, которое
    // вызвалметод doSomething().

    public static void main(String[] args) {
        try {
            doSome();
        }catch (IOException e){
            e.printStackTrace();
        }
        
    }

    public static void doSome() throws IOException {
        
    }
}


