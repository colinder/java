package baekJoon.Condition;

import java.io.*;
import java.util.*;

public class Condition2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M >= 45) {
            System.out.println(H + " " + (M-45));
        } else {
            if (H != 0) {
                System.out.println(H-1 + " " + (M+60-45));
            } else {
                System.out.println("23 " + (M+60-45));
            }
            
        }

        br.close();
    }
}
