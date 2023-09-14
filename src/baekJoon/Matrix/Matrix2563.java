package baekJoon.Matrix;

import java.io.*;
import java.util.*;

public class Matrix2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] arr = new boolean[100][100];

        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = 100 - (Integer.parseInt(st.nextToken()) + 10);

            for (int j = 0; j < 10; j++) {
                for (int j2 = 0; j2 < 10; j2++) {
                    if (!arr[x+j][y+j2]) {
                        arr[x+j][y+j2] = true;
                        sum += 1;
                    }
                }                
            }
        }

        System.out.println(sum);

        br.close();

    }
}
