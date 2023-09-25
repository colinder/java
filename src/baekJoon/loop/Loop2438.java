package baekJoon.loop;

import java.io.*;

public class Loop2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String star = "*";
        String stars = "";
        for (int i = 0; i < N; i++) {
            stars += star;
            bw.write(stars+ "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
