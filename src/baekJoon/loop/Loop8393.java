package baekJoon.Loop;

import java.io.*;

public class Loop8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int total = 0;
        for (int i = 1; i <= N; i++) {
            total += i;
        }

        System.out.println(total);

        br.close();
    }
}
