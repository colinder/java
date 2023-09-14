package baekJoon.Sort;

import java.io.*;
import java.util.*;

public class Sort11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (i1, i2) -> {
            if (i1[1] == i2[1]) {
                return i1[0] - i2[0];
            } else {
                return i1[1] - i2[1];
            }
        });

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i][0]+ " " + arr[i][1] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
