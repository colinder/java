package swea.D3;

import java.io.*;
import java.util.*;

public class swea11736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            for (int j = 1; j < arr.length-1; j++) {
                if (Math.min(arr[j-1], arr[j+1]) < arr[j] && Math.max(arr[j-1], arr[j+1]) > arr[j]) {
                    count += 1;
                }
            }

            System.out.println("#"+(i+1)+" "+count);
        }
    }
}
