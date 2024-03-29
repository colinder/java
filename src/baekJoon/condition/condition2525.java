package baekJoon.Condition;

import java.io.*;
import java.util.*;

public class Condition2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        if (B+C >= 60) {
            if ((A+(B+C)/60) < 24) {
                System.out.println((A+(B+C)/60) + " " + (B+C)%60);
            } else {
                System.out.println(((A+(B+C)/60)%24) + " " + (B+C)%60);
            }
        } else {
            System.out.println(A + " " + (B+C));
        }

        br.close();
    }
}
