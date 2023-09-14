package baekJoon.Sort;

import java.io.*;
import java.util.*;

public class Sort1427문자열정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split("");
              
        Arrays.sort(arr, (i1, i2) -> Integer.parseInt(i2) - Integer.parseInt(i1));

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]);
        }
        br.close();
        bw.flush();
        bw.close();
    }
}

