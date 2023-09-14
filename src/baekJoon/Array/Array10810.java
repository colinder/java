package baekJoon.Array;

import java.io.*;
import java.util.*;

public class Array10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int i=0; i<M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st2.nextToken());
            int e = Integer.parseInt(st2.nextToken());
            int v = Integer.parseInt(st2.nextToken());

            for (int j=s-1; j<e; j++) {
                arr[j] = v;
            }
        }

        for (int j=0; j<N; j++) {
            bw.write(arr[j]+ " ");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
