package swea.D2;

import java.io.*;
import java.util.*;

public class swea1984 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[10];

            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            double sum = 0.0;
            for (int j = 1; j < 9; j++) {
                sum += arr[j];
            }

            System.out.println("#"+(i+1)+" "+Math.round(sum/8));

        }
    }
}
