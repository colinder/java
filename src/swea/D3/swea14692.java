package swea.D3;

import java.io.*;
import java.util.*;

public class swea14692 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            if (N%2 == 1) {
                System.out.println("#"+(i+1)+" Bob");
            } else {
                System.out.println("#"+(i+1)+" Alice");
                
            }
            
        }
    }
}
