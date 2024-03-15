package Seminar2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex004 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new FileReader("1.txt"));
        List<String> sb = new ArrayList<>();
        String content = br.readLine();

        Map <String, Integer> map = new HashMap<>();
        for (String i : sb) {
            String[] parts = i.split("=");
            //parts = ["Анна", "4"].
            map.put(parts[0], parts[0].length());
        }
    }
}
