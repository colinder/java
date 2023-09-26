package swea.D3;

import java.io.*;
import java.util.*;


public class swea14178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());

            int result = 0;
            if (N%(2*D+1) != 0) {
                result = N/(2*D+1) + 1;
            } else {
                result = N/(2*D+1);
            }

            System.out.println("#"+(i+1)+" "+result);


        }
    }

}
