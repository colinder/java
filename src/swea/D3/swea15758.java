package swea.D3;

import java.io.*;
import java.util.*;

public class swea15758 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String A = st.nextToken();
            String B = st.nextToken();

            String result = "yes";
            if (A.length() == B.length()) {
                if (!A.equals(B)) {
                    result = "no";
                }
            } else if (A.length() > B.length()) {
                A += A;
                int Bi = 0;
                for (int j = 0; j < A.length(); j++) {
                    if (Bi == B.length()) Bi = 0;
                    if (!A.substring(j, j+1).equals(B.substring(Bi, Bi+1))) {
                        result = "no";
                        break;
                    }
                    Bi += 1;
                }
            } else {
                B += B;
                int Ai = 0;
                for (int j = 0; j < B.length(); j++) {
                    if (Ai == A.length()) Ai = 0;
                    if (!B.substring(j, j+1).equals(A.substring(Ai, Ai+1))) {
                        result = "no";
                        break;
                    }
                    Ai += 1;
                }
            }
            System.out.println("#"+(i+1)+" "+result);        
        }
        br.close();
    }
}
