package swea.D3;

import java.io.*;
import java.util.*;

public class swea14555 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String N = br.readLine();
            int count = 0;

            for (int j = 0; j < N.length(); j++) {
                try {
                    if (N.substring(j, j + 1).equals("(")) {
                        if (N.substring(j + 1, j + 2).equals("|")) {
                            count += 1;
                        } else if ( N.substring(j + 1, j + 2).equals(")")) {
                            continue;
                        }
                    } else if (N.substring(j, j + 1).equals(")")) {
                        if (N.substring(j - 1, j).equals("|") || N.substring(j - 1, j).equals("(")) {
                            count += 1;
                        }
                    }
                } catch (Exception e) {
                    continue;
                }
            }
            System.out.println("#" + (i + 1) + " " + count);
        }
        br.close();
    }
}
