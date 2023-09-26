package swea.D3;

import java.io.*;
import java.util.*;

public class swea11856 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int[] arr = new int[26];
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                arr[s.charAt(j)-65] += 1;                
            }

            String result = "Yes";

            for (int j = 0; j < arr.length; j++) {
                if (arr[j]%2 != 0 || arr[j] == 4) {
                    result = "No";
                    break;
                }
            }
            System.out.println("#"+(i+1)+" "+result);
        }
    }
}
