package baekJoon.loop;

import java.io.*;
import java.util.*;

public class Loop10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean flag = true;
        while (flag) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b ==0) {
                flag = false;
            } else {
                bw.write(a + b + "\n");
            }

        }

        br.close();

        bw.flush();
        bw.close();
    }
}
