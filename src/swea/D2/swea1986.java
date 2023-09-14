package swea.D2;

import java.io.*;

public class swea1986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            int total = 0;
            for (int j = 1; j <= N; j++) {
                // 홀수의 경우
                if (j % 2 == 1) {
                    total += j;
                } else {
                    total -= j;
                }
            }

            System.out.println("#" + (i + 1) + " " + total);
        }

    }
}
