package baekJoon.Advanced1;

import java.io.*;
import java.util.*;

public class VAdvanced25206 {
    public static void main(String[] args) throws IOException {
        Map<String, Double> dictionary = new HashMap<>();
        dictionary.put("A+", 4.5);
        dictionary.put("A0", 4.0);
        dictionary.put("B+", 3.5);
        dictionary.put("B0", 3.0);
        dictionary.put("C+", 2.5);
        dictionary.put("C0", 2.0);
        dictionary.put("D+", 1.5);
        dictionary.put("D0", 1.0);
        dictionary.put("F", 0.0);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = 0;
        double total = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();            
            double point = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) {
                continue;
            }
            
            total += point * dictionary.get(grade);
            N += point;
        }

        System.out.println(total/N);
    }
}
