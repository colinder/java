package baekJoon.String;

import java.io.*;
import java.util.*;

public class String2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String le = st.nextToken();
        String ri = st.nextToken();

        String a = "";
        String b = "";
        for (int i = 2; i >= 0; i--) {
            a += le.charAt(i);
            b += ri.charAt(i);
        }

        // 함수 사용
        // int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		// int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        if (Integer.parseInt(a) > Integer.parseInt(b)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        
        br.close();
    }
}
