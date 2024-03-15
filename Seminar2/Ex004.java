package Seminar2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex004 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("Seminar2/1.txt"));
        List<String> sb = new ArrayList<>();
        String content = br.readLine();
        while (content != null) {
            sb.add(content);
            content = br.readLine();
        }
        br.close();
        // ["Анна=4", "Елена=5", "Марина=6", ...]
        Map<String, Integer> map = new HashMap<>();
        for (String i : sb) {
            String[] parts = i.split("=");
            // parts = ["Анна", "4"].
            map.put(parts[0], parts[0].length());
        }
        StringBuilder output = new StringBuilder();
        FileWriter fileWriter = new FileWriter("Seminar2/1.txt");
        for (String name : map.keySet()) {
            output.append(name).append("=").append(map.get(name)).append("\n");
        }
        fileWriter.write(String.valueOf(output));
        fileWriter.flush();
        fileWriter.close();
    }
}
