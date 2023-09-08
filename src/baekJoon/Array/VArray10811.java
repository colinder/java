package baekJoon.Array;

import java.io.*;
import java.util.*;

public class VArray10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        
    
        for (int j = 0; j < M; j++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            
            int s = Integer.parseInt(st2.nextToken()) -1;
            int e = Integer.parseInt(st2.nextToken()) -1;

            while(s < e) {
                int temp = arr[s];
                arr[s++] = arr[e];
                arr[e--] = temp;
            }
        }
        br.close();
        
        for (int e: arr) {
            System.out.print(e+" ");
        }
    }

}
