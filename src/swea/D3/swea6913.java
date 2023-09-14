package swea.D3;

import java.io.*;
import java.util.*;

public class swea6913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[][] arr = new int[N][M];

            int maxCount = 0;
            int pMax = 0;
            for (int j = 0; j < N; j++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                int total = 0;
                for (int j2 = 0; j2 < M; j2++) {
                    arr[j][j2] = Integer.parseInt(st2.nextToken());
                    if(arr[j][j2] == 1) {
                        total += 1;
                    }
                }
                if (total > maxCount) {
                    maxCount = total;
                    pMax = 1;
                } else if (total == maxCount) {
                    pMax += 1;
                }
            }
            bw.write("#"+(i+1)+" "+pMax+" "+maxCount+ "\n");
        }        
        br.close();
        bw.flush();
        bw.close();
    }
}
