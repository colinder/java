package baekJoon.Sort;

import java.io.*;
import java.util.*;

public class Sort1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            arr[i] = s;
        }

        Arrays.sort(arr, (i1, i2) -> {
            if (i1.length() != i2.length()) {
                return i1.length() - i2.length();
            } else {
                return i1.compareTo(i2);
            }
        });
        //[i, im, it, no, no, but, more, more, wait, wont, yours, cannot, hesitate]

        bw.write(arr[0] + "\n");
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i-1].equals(arr[i])) {
                bw.write(arr[i] + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
