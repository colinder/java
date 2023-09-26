package swea.D2;

import java.io.*;

public class swea1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] arr = br.readLine().split("");
            int result = 1; 
            for (int j = 0; j < arr.length/2; j++) {
                if(!arr[j].equals(arr[arr.length-j-1])) {
                    result = 0;
                    break;
                }
            }
            System.out.println("#"+(i+1)+" "+result);
        }
    }
}
