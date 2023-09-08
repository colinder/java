package baekJoon.loop;

import java.io.*;
import java.util.*;

public class Loop11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        int N = Integer.parseInt(br.readLine());
        
        for (int i =0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            bw.write("Case #"+(i+1)+": "+(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }

        br.close();

        bw.flush();
        bw.close();

    }
}
