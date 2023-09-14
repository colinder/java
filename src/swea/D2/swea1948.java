package swea.D2;

import java.io.*;
import java.util.*;

public class swea1948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 31);
        map.put(2, 28);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s_m = Integer.parseInt(st.nextToken());
            int s_d = Integer.parseInt(st.nextToken());
            int e_m = Integer.parseInt(st.nextToken());
            int e_d = Integer.parseInt(st.nextToken());

            int total = 0;
            if (s_m == e_m) {
                total += e_d - s_d + 1;
            } else if (e_m - s_m == 1) {
                total += map.get(s_m) - s_d + 1;
                total += e_d;

            } else {
                total += map.get(s_m) - s_d + 1;
                total += e_d;
                for (int j = s_m+1; j < e_m; j++) {
                    total += map.get(j);
                }

            }

            System.out.println("#"+(i+1)+" "+total);
        }
        
    }
}
