package baekJoon.Advanced1;

import java.io.*;
import java.util.StringTokenizer;


public class Advanced3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 1 1 2 2 2 8
        int[] result = {1,1,2,2,2,8};
        String[] arr = br.readLine().split(" ");
        
        for (int i = 0; i < arr.length; i++) {
            bw.write(result[i] - Integer.parseInt(arr[i])+ " ");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
