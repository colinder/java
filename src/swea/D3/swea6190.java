package swea.D3;

import java.io.*;
import java.util.*;

public class swea6190 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int x = 0;
            int y = 0;
            int max = -1;
            for (int j = 0; j < N; j++) {
                for (int j2 = 0; j2 < N; j2++) {
                    if (j == j2) {
                        continue;
                    } else {
                        String a = ""+arr[j]*arr[j2];
                        if (a.length() == 1) break;
                        for (int k = 0; k < a.length()-1; k++) {
                            if (Integer.parseInt(a.substring(k, k+1)) > Integer.parseInt(a.substring(k+1, k+2))) {
                                break;
                            } else if (arr[j]*arr[j2] > max) {
                            max = arr[j]*arr[j2];
                            }
                        }
                        
                    }
                }
            }
            System.out.println("#"+(i+1)+" "+max);
        }
    }
}
