package swea.D2;

import java.io.*;
import java.util.*;

public class swea1945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = {2,3,5,7,11};
            int[] result = new int[5];
            int index = 0;
            
            int a = 0;
            int n = N;
            while(true) {
                if (n == 1 ) {
                    result[index] = a;
                    break;
                }
                if(n%arr[index] == 0) {
                    a += 1;
                    n = n/arr[index];
                } else {
                    result[index] = a;
                    a = 0;
                    index += 1;
                }
            }
            System.out.print("#"+(i+1)+" ");
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[j]+" ");
            }
            System.out.print("\n");
        }
    }
}
