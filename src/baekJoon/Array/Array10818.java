package baekJoon.Array;

import java.io.*;
import java.util.*;

public class Array10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[N];
        for (int x=0; x<N; x++) {
            arr[x] = Integer.parseInt(st.nextToken());
        }
        
        int min = 1000000;
        for (int e : arr) {
            if (e < min) {
                min = e;
            }
        }

        int max = -1000000;
        for (int e: arr) {
            if (e > max) {
                max = e;
            }
        }
        
        System.out.println(min+ " " + max);

        br.close();
    }
}
