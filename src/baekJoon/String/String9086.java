package baekJoon.String;

import java.io.*;
import java.util.*;

public class String9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split("");
            System.out.println(s[0]+s[s.length-1]);
        }

        br.close();
    }
}
