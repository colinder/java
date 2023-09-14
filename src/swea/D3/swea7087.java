package swea.D3;

import java.io.*;

public class swea7087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int[] arr = new int[26];

            int N = Integer.parseInt(br.readLine());

            for (int j = 0; j < N; j++) {
                String S = br.readLine();
                arr[S.charAt(0) - 65] += 1;
            }

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != 0) {
                    count += 1;
                } else {
                    break;
                }

            }
            System.out.println("#" + (i + 1) + " " + count);
        }
    }
}