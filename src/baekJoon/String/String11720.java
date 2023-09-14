package baekJoon.String;

import java.io.*;
import java.util.*;

public class String11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("");

        int total = 0;
        for (int i = 0; i < N; i++) {
            total += Integer.parseInt(arr[i]);
        }

        System.out.println(total);

        br.close();
    }   
}
