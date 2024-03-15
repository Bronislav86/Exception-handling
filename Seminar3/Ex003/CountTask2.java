package Seminar3.Ex003;

import java.io.IOException;

public class CountTask2 implements AutoCloseable {
    private Integer count;

    public CountTask2() {
        this.count = 0;
    }

    public void add() throws IOException {
        closeCheck();
        this.count++;
    }

    public void closeCheck() throws IOException {
        if (count == null) {
            throw new IOException("Екземпляр закрыт!");
        }
    }

    @Override
    public void close() throws IOException {
        count = null;

    }

    public Integer getValue() throws IOException {
        closeCheck();
        return count;
    }
}
