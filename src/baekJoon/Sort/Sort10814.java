package baekJoon.Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sort10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        Arrays.sort(arr, (i1, i2) -> {
            if (Integer.parseInt(i1[0]) != Integer.parseInt(i2[0])) {
                return Integer.parseInt(i1[0]) - Integer.parseInt(i2[0]);
            } else {
                return 0;
            }
        });

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i][0]+ " " + arr[i][1] + '\n');
        }

        br.close();
        bw.flush();
        bw.close();
    }   
}
