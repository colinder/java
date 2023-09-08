package baekJoon.Array;

import java.io.*;
import java.util.*;

public class Array10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i=0; i< N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        
        for (int e: arr) {
            if (e < X) {
                bw.write(String.valueOf(e)+" ");
            }
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
