package swea.D2;

import java.io.*;
import java.util.*;

public class swea1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            System.out.print("#"+(i+1));                
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" "+arr[j]);                
            }
            System.out.print("\n");                

        }

    }
}
