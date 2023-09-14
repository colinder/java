package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            
            String result = "";
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                int n = Integer.parseInt(st.nextToken());
                
                
                for (int k = 0; k < n; k++) {
                    result += s;
                }
            }
            
            System.out.println("#"+(i+1));
            int count = 0;
            for (int k = 0; k < result.length(); k++) {
                if (count==9) {
                    System.out.print(result.substring(k, k+1));
                    System.out.print("\n");
                    count = 0;
                } else {
                    System.out.print(result.substring(k, k+1));
                    count += 1;
                }
            }
            System.out.print("\n");


            
        }
    }
}
