package Seminar3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex001 {
    public static void main(String[] args) {
        
    
    }

    public void rwLine (Path pathRead, Path pathWrite) throws IOException {
        // BufferedReader in = null;
        // BufferedWriter out = null;

        try (BufferedReader in = Files.newBufferedReader(pathRead); BufferedWriter out = Files.newBufferedWriter(pathWrite)){
            out.write(in.readLine());
        }
    }
}
