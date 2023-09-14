package baekJoon.Loop;

import java.io.*;
import java.util.*;

public class Loop10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st ;
        String str;
        
        while((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
            System.out.println(a+b);
        }
        br.close();
    }
}
