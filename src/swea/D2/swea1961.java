package swea.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea1961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            String result = "";
            String[][] arr = new String[N][N];

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j2 = 0; j2 < N; j2++) {
                    arr[j][j2] =  st.nextToken();
                }
            }

            for (int j = 0; j < N; j++) {
                String temp = "";
                for (int j2 = N-1; j2 >= 0; j2--) {
                    temp += arr[j2][j];
                }
                result += temp+" ";                
            }

            for (int j = N-1; j >= 0; j--) {
                String temp = "";
                for (int j2 = N-1; j2 >= 0; j2--) {
                    temp += arr[j][j2];
                }
                result += temp+" ";                
            }


            for (int j = N-1; j >= 0; j--) {
                String temp = "";
                for (int j2 = 0; j2 < N; j2++) {
                    temp += arr[j2][j];
                }
                result += temp+" ";                
            }
            
            System.out.println("#"+(i+1));
            String[] a = result.split(" ");
            for (int j = 0; j < N; j++) {
                System.out.print(a[j]+" "+a[j+N]+" "+a[j+(N*2)]);
                System.out.print("\n");
            }           
            
        }
    }
}
