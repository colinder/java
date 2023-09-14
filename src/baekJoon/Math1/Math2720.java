package baekJoon.Math1;

import java.io.*;

public class Math2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] arr = {25, 10, 5, 1};

        for (int i = 0; i < T; i++) {
            int money = Integer.parseInt(br.readLine());

            for (int j = 0; j < 4; j++) {
                // System.out.println(money/arr[j]);
                bw.write(money/arr[j] + " "); ;
                money = money%arr[j];
            }
            bw.write("\n"); ;

        }
        bw.flush();
        
    }
}
