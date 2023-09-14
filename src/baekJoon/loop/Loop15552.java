package baekJoon.Loop;

import java.io.*;
import java.util.*;

public class Loop15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i< N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            // bw.write(A+B);
            bw.write(A+B+"\n"); // 줄바꿈을 꼭 넣어줘야 줄을 바꾸며 출력한다.
        }
        br.close();

        bw.flush();
        bw.close();
    }   
}
