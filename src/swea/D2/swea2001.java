package swea.D2;

import java.io.*;
import java.util.*;

public class swea2001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {            
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            int[][] arr = new int[N][N];
            
            for (int j = 0; j < N; j++) {
                StringTokenizer fly = new StringTokenizer(br.readLine());
                for (int x = 0; x < N; x++) {
                    arr[j][x] = Integer.parseInt(fly.nextToken());
                }
            }

            int max = 0;
            
            for (int x = 0; x < N-M+1; x++) {
                for (int y = 0; y < N-M+1; y++) {
                    int temp = 0;
                    for (int j = 0; j < M; j++) {
                        for (int j2 = 0; j2 < M; j2++) {
                            temp += arr[x+j][y+j2];    
                        }
                    }
                    if (temp > max) {
                        max = temp;
                    }
                }
            }
            System.out.println("#"+(i+1)+" "+max);

        }
    }   
}
