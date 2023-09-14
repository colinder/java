package swea.D3;

import java.io.*;
import java.util.*;

public class swea7102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] p = new int[N+M+1];

            for (int j = 1; j <= N; j++) {
                for (int j2 = 1; j2 <= M; j2++) {
                    p[j+j2] += 1;
                }
            }

            int max = 0;
            for (int j = 0; j < p.length; j++) {
                if (p[j] > max) {
                    max=p[j];
                }               
            }

            System.out.print("#"+(i+1));
            for (int j = 0; j < p.length; j++) {
                if (p[j] == max) {
                    System.out.print(" "+j);
                }
            }
            System.out.print("\n");
        }
    }
}
