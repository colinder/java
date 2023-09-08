package baekJoon.Array;

import java.io.*;
import java.util.*;

public class Array5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[30];
        for (int i=0; i<28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n-1] = 1;
        }

        int index = 0;
        for (int e: arr) {
            if (e != 1) {
                System.out.println(index+1);
            }
            index += 1;
        }

        br.close();
    }
}
