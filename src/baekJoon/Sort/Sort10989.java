package baekJoon.Sort;

import java.io.*;
import java.util.*;

public class Sort10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
