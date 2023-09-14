package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea1959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            int[] arrN = new int[N];
            int[] arrM = new int[M];

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arrN[j] = Integer.parseInt(st2.nextToken());
            }

            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arrM[j] = Integer.parseInt(st3.nextToken());
            }

            String l = (arrN.length < arrM.length ? "M" : "N");

            int max = -1000000000 ;
            if (l == "M") {
                for (int j = 0; j < arrM.length-arrN.length+1; j++) {
                    int total = 0;
                    for (int j2 = 0; j2 < arrN.length; j2++) {
                        total += arrM[j+j2]*arrN[j2];
                    }
                    
                    if (total > max) {
                        max = total;
                    }
                }
            } else {
                for (int j = 0; j < arrN.length-arrM.length+1; j++) {
                    int total = 0;
                    for (int j2 = 0; j2 < arrM.length; j2++) {
                        total += arrN[j+j2]*arrM[j2];
                    }
                    
                    if (total > max) {
                        max = total;
                    }
                }
            }
            
            System.out.println("#"+(i+1)+" "+max);
        }
    }
}
