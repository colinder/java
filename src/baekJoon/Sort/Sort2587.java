package baekJoon.Sort;

import java.io.*;
import java.util.*;

public class Sort2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
            sum += n;
        }

        Arrays.sort(arr);

        System.out.println(sum/5);
        System.out.println(arr[2]);

        br.close();        
    }
}
