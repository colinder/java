package baekJoon.condition;

import java.io.*;
import java.util.*;

public class condition2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] list = { a, b, c };
        int max = 0;
        for (int e : list) {
            if (e > max) {
                max = e;
            }
        }

        // 전부 다른 경우
        if (a != b && a != c && b != c) {
            System.out.println(max * 100);
            // 셋이 같은 경우
        } else if ((a == b && b == c)) {
            System.out.println(a * 1000 + 10000);
        } else {
            if (a == b) {
                System.out.println(a * 100 + 1000);
            } else if (a == c) {
                System.out.println(a * 100 + 1000);
            } else {
                System.out.println(c * 100 + 1000);
            }
        }

        br.close();
    }
}
