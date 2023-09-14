package swea.D2;

import java.io.*;
import java.util.*;

public class swea1228 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int[] arr = new int[10];

            int N = Integer.parseInt(br.readLine());
            int index = 1;
            while(true) {
                int sum = 0;
                String t = String.valueOf(N*index);

                for (int j = 0; j < t.length(); j++) {
                    arr[Integer.parseInt(t.substring(j, j+1))] = 1;
                }
                
                index += 1;
                for (int j = 0; j < arr.length; j++) {
                    sum += arr[j];
                }
                if (sum == 10) {
                    break;
                }
            }

            System.out.println("#"+(i+1)+" "+(index-1)*N);
        }
    }
}
