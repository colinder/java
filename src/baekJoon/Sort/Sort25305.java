package baekJoon.Sort;

import java.io.*;
import java.util.*;

public class Sort25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());        
        
        StringTokenizer scores = new StringTokenizer(br.readLine());        
        
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            int s = Integer.parseInt(scores.nextToken());
            arr[i] = s;
        }

        Arrays.sort(arr);

        System.out.println(arr[N-k]);

        br.close();        
    }
}
