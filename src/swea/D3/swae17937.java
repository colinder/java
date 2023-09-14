package swea.D3;

import java.io.*;
import java.math.*;
import java.util.*;

public class swae17937 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Long q = Long.parseLong(st.nextToken());
            Long w = Long.parseLong(st.nextToken());
            BigInteger a = BigInteger.valueOf(q);
            BigInteger b = BigInteger.valueOf(w);

            System.out.println("#" + (i + 1) + " " + a.gcd(b));
        }
    }

}
