package swea.D2;

import java.io.*;

public class swea1970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] changes = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String result = "";
            int change = Integer.parseInt(br.readLine());
            int c = change;

            for (int j = 0; j < changes.length; j++) {
                result += String.valueOf(c / changes[j]) + " ";
                c = c % changes[j];
            }

            System.out.println("#" + (i + 1));
            System.out.println(result);
        }
    }
}
