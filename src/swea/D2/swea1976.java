package swea.D2;

import java.io.*;
import java.util.*;

public class swea1976 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int sh = Integer.parseInt(st.nextToken());
            int sm = Integer.parseInt(st.nextToken());
            int eh = Integer.parseInt(st.nextToken());
            int em = Integer.parseInt(st.nextToken());

            int plus = 0;
            int m = 0;
            if (sm + em >= 60) {
                plus = (sm+em)/60;
                m = (sm+em)%60;
            } else {
                m = (sm+em);
            }

            int h = 0;
            if (sh+eh+plus > 12) {
                if ((sh+eh+plus)%12 == 0) {
                    h = 12;
                } else {
                    h = (sh+eh+plus)%12;
                }
            } else {
                h = (sh+eh+plus);
            }

            System.out.println("#"+(i+1)+" "+h+" "+m);

            
        }
    }
}
