package baekJoon.Math1;

import java.io.*;
import java.util.*;

public class QMath2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int result = 0;
        int len = N.length();
        for(int i=0; i<len; i++) {
            int val = N.charAt(len-i-1)-55;
            if(val < 10) {
                val += 7;
            }
            result += val * Math.pow(B, i);
        }
        System.out.println(result);


    }
}
