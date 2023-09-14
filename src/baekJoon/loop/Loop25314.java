package baekJoon.Loop;

import java.io.*;

public class Loop25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String a = "long ";
        String result = "";
        for (int i=0; i < (N/4); i++) {
            result += a;
        }
        System.out.println(result+"int");

        br.close();
    }
}
