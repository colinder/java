package swea.D2;

import java.io.*;
import java.util.*;

public class swea1850 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());                
            }
            // System.out.println(Arrays.toString(arr));

            int max = arr[N-1];
            long sum = 0;  // 이걸 int로 했다가 헤맸다.
            for (int j = arr.length-2; j >= 0; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                }
                sum += max - arr[j];
            }
            System.out.println("#"+(i+1)+ " "+sum);
        }
    }
}
