package baekJoon.Array;

import java.io.*;
import java.util.*;

public class Array10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i =0 ; i<N; i++) {
            arr[i] = i+1;
        }

        for (int j =0 ; j <M; j++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st2.nextToken());
            int e = Integer.parseInt(st2.nextToken());

            if (s != e) {
                int sv = arr[s-1];
                int ev = arr[e-1];

                arr[s-1] = ev;
                arr[e-1] = sv;
            }
        }

        for (int e: arr) {
            bw.write(e+" ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
