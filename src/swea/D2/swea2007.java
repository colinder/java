package swea.D2;

import java.io.*;
import java.util.*;

public class swea2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            for (int j = 1; j < 10; j++) {
                String a = s.substring(0, j);
                String b = s.substring(j, j*2);
                if (a.equals(b)) {
                    System.out.println("#"+(i+1)+" "+j);
                    break;
                }
                
            }
        }
    }
}
