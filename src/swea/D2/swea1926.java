package swea.D2;

import java.io.*;

public class swea1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= N; i++) {
            String t = String.valueOf(i);
            if (t.contains("3") || t.contains("6") || t.contains("9")) {
                for (int j = 0; j < t.length(); j++) {
                    if (t.charAt(j) == '3' || t.charAt(j) == '6' || t.charAt(j) == '9') {
                        System.out.print("-");
                    }
                }
                System.out.print(" ");
            } else {
                System.out.print(i + " ");
            }
            
        }
    }
}
