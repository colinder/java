package swea.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class swea17319 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            String s = br.readLine();

            String result = "Yes";
            if(N%2 == 1) {
                result = "No";
            } else {
                String a = s.substring(0, N/2);
                String b = s.substring(N/2, N);
                
                if (!a.equals(b)) {
                    result = "No";
                }
            }

            System.out.println("#"+(i+1)+" "+result);
            
            
        }
    }
}
