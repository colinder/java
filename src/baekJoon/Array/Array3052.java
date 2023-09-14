package baekJoon.Array;

import java.io.*;
import java.util.*;

public class Array3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[42];
        for (int i = 0; i < 10; i++) {
            int v = Integer.parseInt(br.readLine());
            int remainder = v%42;
            arr[remainder] = 1; 
        }

        int count=0;
        for (int e : arr) {
            if(e == 1) {
                count += 1;
            }
        }

        System.out.println(count);

        br.close();
    }
}
