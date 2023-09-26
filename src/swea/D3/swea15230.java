package swea.D3;

import java.io.*;
import java.util.*;

public class swea15230 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alpa = "abcdefghijklmnopqrstuvwxyz";
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();

            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.substring(j, j+1).equals(alpa.substring(j, j+1))) {
                    count += 1;
                } else {
                    break;
                }
            }            
            System.out.println("#"+(i+1)+" "+count);
        }
    }
}
