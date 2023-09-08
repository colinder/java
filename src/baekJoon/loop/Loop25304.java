package baekJoon.loop;

import java.io.*;
import java.util.*;

public class Loop25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        int total = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int receipt = 0;
        for (int i =0; i < N; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int price = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            receipt += price*n;
        }

        if (total == receipt) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }

        br.close();
    }
}
